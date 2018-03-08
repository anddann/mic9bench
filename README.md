# [](#mic9bench---a-module-integrity-and-confidentiality-for-java-9-analysis-benchmark-suite)MIC9Bench - An Integrity and Confidentiality for Java 9 Modules Analysis Benchmark Suite 


MIC9Bench (module, integrity, confidentiality for Java 9) is an open benchmark suite for evaluating static analyses w.r.t. integrity and confidentiality violations of Java 9 modules.
Therefore, MIC9Bench provides various types of modules' confidentiality and integrity violations (1) and the ground truth that holds the information where the violation occurs (2).


MIC9Bench contains 22 hand-crafted modules each violating either integrity or confidentiality. 
The benchmark suite constitutes test cases for generic static-analysis challenges, e.g., field and object-sensitivity, as well as the module-specific challenges of computing an entry-point model and correctly emulating a module’s usage identifying violations.


The test cases contain special annotations (see instructions below). The statement and argument of the function calls describe the variable to test. To test different analyses, these annotations must be parsed and interpreted. These deliver input and output to the analyses.

### [](#list-of-tests)List of tests

| Fields |  Integrity/Confidentiality | 
| --- | :-: |
| public.primitive.field | I/C  |
| public.nonprimitive.field | I/C |
| public.field.array | I/C |
| public.field.collection | I/C |
| field.abstract.superclass  | I/C | 
| getter.method | C |
| setter.method | I |



| Methods | Integrity/Confidentiality |
| --- | :-: |
| explicit.method  | C |
| implicit.method.interface | C |   	
| implicit.method.abstract.superclass | C |



| Method Parameter | Integrity/Confidentiality |
| --- | :-: |
| added.to.collection | I/C |
| added.to.array | I/C |
| static.method.access.to.field | C |



| Callback | Integrity/Confidentiality |
| --- | :-: |
| argument.callback | C |
| object.reference  | C |



| Exception | Integrity/Confidentiality |
| --- | :-: |
| declared.exception | C |
| undeclared.exception | C |



| Reflection & Invoke API | Integrity/Confidentiality |
| --- | :-: |
| access.varhandle | I/C |
| access.methodhandle | C | 
| access.methodhandle.lookup | I/C |
| access.reflection  | I/C |


| Side-Effect | Integrity/Confidentiality |
| --- | :-: |
| native.code | I/C | 


### [](#instructions-on-special-annotations)Instructions on Annotations

The annotation `@Critical` marks sensitive entities to analyze with respect to integrity or confidentiality violations.
Thus, the annotation describes the test case's variable and allocation site directly within the test program's code. 
To use this benchmark, the appropriate information must be parsed from this annotation.
The annotations are defined in the module `mic9bench.annotation`, which must be on the module-path while compiling the test suite.


Additionally, the annotation `@Critical(path="Leak.field", type=ViolationType.INTEGRITY);`  defines the statement at which the test is conducted and contains the ground truth. 
The first argument, `"Leak.field"` is the access path for which the violation may occur, e.g., the field `field` of class `Leak`. 
The second argument specifies whether  an `INTEGRITY`, `CONFIDENTIALITY`, `BOTH`, or `NONE` violation occurs w.r.t. the marked allocation site.

### [](#how-to-test-a-module-analysis)How to test a Confidentiality and Integrity Java 9 Module Analysis

Query: Can the integrity or confidentiality of the field/method/class `t`  be violated through the access path `a`?

The field/method/class `t` is given through the `Critical` annotation. Parse all fields/methods/classes given the annotation.
 Match them to the all their possible allocation sites `s`. For each matching make sure that the allocation site is within the computed points-to set that is accessible outside of the module.

