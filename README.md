# Poly-Hybrid-Cipher

# 🔐 HybridCipher – Java Hybrid Encryption (Caesar + Substitution Cipher)

## 📘 Overview
**HybridCipher** is a simple Java program that demonstrates a hybrid cryptographic approach by combining two classical encryption methods:
- **Caesar Cipher (Rotation/Shift Cipher)**
- **Substitution Cipher**

The encryption process first applies a Caesar shift to each letter and then performs a substitution based on a predefined permutation of the alphabet.  
This combination provides stronger encryption than either method alone while keeping the algorithm easy to understand and implement.

---

## ⚙️ Features
✅ Hybrid encryption using rotation and substitution  
✅ Simple decryption to recover the original text  
✅ Works for uppercase alphabets (A–Z)  
✅ Ignores and preserves spaces and punctuation marks  
✅ Easily customizable substitution map and shift value  

---

## 🧩 Encryption Logic
1. **Caesar Rotation:** Each letter in the plaintext is shifted by a given number (e.g., 3).  
2. **Substitution:** The rotated letter is replaced according to a predefined substitution map.  

Example:
Plaintext: HELLO WORLD
Shift: 3
Encrypted: AIGGK MKXGU
Decrypted: HELLO WORLD

yaml
Copy code

---

## 🧠 Decryption Logic
The decryption process performs the reverse of encryption:
1. Reverse the substitution step.
2. Apply the reverse Caesar rotation.

---

## 🧾 Code Explanation

### Main Components
| Method | Description |
|---------|--------------|
| `encrypt(String text, int shift)` | Encrypts text using Caesar rotation followed by substitution. |
| `decrypt(String text, int shift)` | Decrypts text by reversing substitution and rotation. |
| `main(String[] args)` | Demonstrates encryption and decryption with a sample message. |

### Substitution Map
```java
private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private static final String SUBSTITUTION = "QWERTYUIOPASDFGHJKLZXCVBNM";
🚀 How to Run
1️⃣ Compile the Program
Open your terminal and navigate to the project folder:


javac HybridCipher.java
2️⃣ Run the Program
   java HybridCipher

3️⃣ Output

Original : HELLO WORLD
Encrypted: AIGGK MKXGU
Decrypted: HELLO WORLD
🧪 Try Your Own Message
You can modify the message and shift value in the main() method:


String message = "SECRET MESSAGE";
int shift = 5;
🧰 Requirements
Java JDK 8 or later

Any text editor or IDE (e.g., VS Code, IntelliJ IDEA, Eclipse)

📁 Project Structure
Copy code
HybridCipher/
├── HybridCipher.java
└── README.md

🧩 Customization
Change the SUBSTITUTION string to use a different permutation.

Adjust the shift value to modify the rotation.

Extend the program to support lowercase, numbers, or symbols.

🧑‍💻 Author
1) Mansi Prakash  (1OX22CS098)
2) Nanditha B S   (1OX22CS111) 

📅 Created on: November 2025
💬 Feel free to fork, improve, and contribute!
