### **Challange** 

      Pedro was disappointed because he didn't speak Python well enough to capture some of the flags on CTFLearn. His plan for revenge was to create one in his native 
      language (Java). The flag is a String of 6 alphanumeric characters. Capture it. https://mega.nz/#!SHp1xCAL!I9-Zy4kwu_JY019MiYZ6CzGey8sJ6UvqE-ML2idmkrs


### **How To Solve**

To solve this challenge, we need to find a 6-character alphanumeric string (`flag`) that satisfies the conditions in the `isFlag` method. Here’s how to approach it:

---

### **Code Analysis**

1. **The `isFlag` Method:**
   - Checks whether the input string `str` satisfies:
     - `str.hashCode() == 1471587914`
     - `str.toLowerCase().hashCode() == 1472541258`

2. **Flag Characteristics:**
   - The flag is a string of **6 alphanumeric characters** (based on the `"------"` placeholder).

3. **Solution Approach:**
   - Since the Java `hashCode` is deterministic but not reversible, brute-forcing all 6-character combinations is the most viable method.
   - We'll write a brute force program in Java to systematically generate strings and test them against the conditions.

---

### **Steps to Solve**

#### **Brute Force Code**

Write the following Java program to find the flag:

```java
public class FindTheFlag {
    public static void main(String[] args) {
        int targetHash1 = 1471587914;
        int targetHash2 = 1472541258;

        // Iterate through all possible 6-character alphanumeric combinations
        for (char c1 = '0'; c1 <= 'z'; c1++) {
            for (char c2 = '0'; c2 <= 'z'; c2++) {
                for (char c3 = '0'; c3 <= 'z'; c3++) {
                    for (char c4 = '0'; c4 <= 'z'; c4++) {
                        for (char c5 = '0'; c5 <= 'z'; c5++) {
                            for (char c6 = '0'; c6 <= 'z'; c6++) {
                                String candidate = "" + c1 + c2 + c3 + c4 + c5 + c6;

                                // Check both hash conditions
                                if (candidate.hashCode() == targetHash1 &&
                                    candidate.toLowerCase().hashCode() == targetHash2) {
                                    System.out.println("Flag found: " + candidate);
                                    return; // Exit once the flag is found
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
```

---

#### **How the Program Works**

1. **Nested Loops:**
   - The program uses six nested loops to generate all possible 6-character combinations of alphanumeric characters from `'0'` to `'z'`.

2. **Hash Validation:**
   - For each combination, the program computes its `hashCode` and `toLowerCase().hashCode()`.
   - It checks whether these match the given hash values: `1471587914` and `1472541258`.

3. **Output:**
   - If a matching string is found, the program prints it as the flag and exits.

---
