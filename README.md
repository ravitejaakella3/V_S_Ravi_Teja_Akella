#V_S_Ravi_Teja_Akella

# Java Problem Solutions

This repository contains solutions to the following Java problems:

1. Simple Calculator 
2. Generate Odd Numbers Until `a` 
3. Generate Series Based on Odd Indexing Logic 
4. Count Multiples of 1 to 9 in a Given List 

---

## Problem 1: Simple Calculator

###  Description:
A basic calculator that performs operations like addition, subtraction, multiplication and division using a class.

###  Input:
- `a`: double  
- `b`: double  
- `type_of_operation`: String (`"addition"`, `"subtraction"`, `"multiplication"`, `"division"`)

### Output:
Performs the operation and prints the result.

### ▶Run:
```bash
javac Program1.java
java Program1
````

---

## Problem 2: Generate First `a` Odd Numbers

### Description:

Print the first `a` odd numbers:
Example:
Input `a = 4` → Output: `1, 3, 5, 7`

###  Input:

`a`: integer

###  Output:

First `a` odd numbers

### Run:

```bash
javac Program2.java
java Program2
```

---

## Problem 3: Conditional Odd Series

###  Description:

Print the first `a` odd numbers only if `a` is odd.
If `a` is even, treat it as `a - 1`.

###  Input/Output:

| Input `a` | Output        |
| --------- | ------------- |
| 1         | 1             |
| 2         | 1             |
| 3         | 1, 3, 5       |
| 4         | 1, 3, 5       |
| 5         | 1, 3, 5, 7, 9 |
| 6         | 1, 3, 5, 7, 9 |

### Run:

```bash
javac Program3.java
java Program3
```

---

## Problem 4: Count Multiples in List

### Description:

Given a list of integers, count how many are divisible by each number from 1 to 9.

### Input:

```java
int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
```

### Output:

```json
{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}
```

###  Run:

```bash
javac Program4.java
java Program4
```

---

## Notes

* Each problem is implemented in its own `.java` file.
* Compile and run each file individually using `javac` and `java`.
* Ensure Java is installed and environment variables are properly set.

```
