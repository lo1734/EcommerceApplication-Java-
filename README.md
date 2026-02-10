# 🛒 Inventory & Order Management System (Java)

A mini **Inventory & Order Management System** built using Java.  
This project demonstrates Object-Oriented Programming (OOP), composition, abstraction using interfaces, collections framework, and file handling using CSV persistence.

---

# 📌 Features

- Add new products
- Update product stock
- View all available products
- Place orders
- Automatic stock deduction after order
- Data persistence using CSV file
- Clean modular project structure

---

# 🧠 OOP Concepts Used

| Concept        | Implementation |
|---------------|---------------|
| Encapsulation | Private fields + getters/setters |
| Composition   | `Order` contains `List<Product>` |
| Abstraction   | `InventoryOperations` interface |
| Polymorphism  | `InventoryService` implements interface |
| Collections   | `ArrayList` |
| File Handling | `BufferedWriter`, `FileWriter` |

---

# 📂 Complete Project Structure

```
inventory/
│
├── model/
│   ├── Product.java
│   ├── Category.java
│   ├── Customer.java
│   ├── Order.java
│
├── service/
│   ├── InventoryOperations.java
│   ├── InventoryService.java
│
├── util/
│   ├── FileUtil.java
│
└── Main.java
```

---

# ⚙️ Technologies Used

- Java (JDK 8+)
- Java Collections Framework
- File Handling (CSV storage)
- OOP Principles

---

# ▶️ How to Run the Project

## 1️⃣ Clone Repository

```
git clone https://github.com/lo1734/EcommerceApplication-Java-.git
```

## 2️⃣ Navigate to Project Directory

```
cd inventory
```

## 3️⃣ Compile All Files

```
javac model/*.java service/*.java util/*.java Main.java
```

## 4️⃣ Run Application

```
java Main
```

---

# 📝 Sample Output

```
101,Laptop,Electronics,50000.0,10
102,Mouse,Electronics,500.0,50
```

After placing an order:

```
101,Laptop,Electronics,50000.0,8
102,Mouse,Electronics,500.0,45
```

---

# 🗂 CSV File Format (products.csv)

```
id,name,category,price,stock
```

Example:

```
101,Laptop,Electronics,50000.0,8
102,Mouse,Electronics,500.0,45
```

---

# 🔄 Order Workflow

1. User enters Product ID
2. User enters Quantity
3. System checks:
   - Product exists
   - Stock availability
4. Stock is reduced
5. Updated inventory is saved to CSV

---

# 🚀 Future Enhancements

- JSON storage using Gson
- Order history tracking
- Login & authentication system
- Custom exception handling
- HashMap for O(1) product lookup
- Menu-driven CLI system
- Spring Boot REST API conversion
- Database integration (MySQL)

---

# 🎯 Learning Outcomes

By completing this project, you understand:

- Real-world inventory system design
- Proper class modeling
- Interface-based architecture
- Composition in Java
- File persistence mechanism
- Practical OOP implementation

---

# 👨‍💻 Author

**Lohit**  

---

# 📄 License

This project is developed for educational and academic purposes.
