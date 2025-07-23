# 📚 Spring MVC Book Management Application

This project is a simple **Book Management Web App** built using **Spring MVC** and **Spring Data JPA**. It demonstrates how to create, update, list, and soft-delete books using form handling and Thymeleaf templates.

---

## 🚀 Features

- ✅ Add new books using a web form
- ✅ View all active books in a list
- ✅ Update existing book details
- ✅ Soft-delete books (mark as inactive)
- ✅ Responsive UI with Bootstrap
- ✅ Clean separation of controller, service, and repository layers

---

## 🛠️ Technologies Used

- Java 21  
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- Thymeleaf  
- MySQL  
- Bootstrap 5  
- Lombok  
- Maven

---

## 🧩 Concepts Covered

- `@ModelAttribute` for form data binding  
- `ModelAndView` for returning view names with model data  
- Soft delete implementation using a boolean flag (`activeSw`)  
- Redirection between add/edit/list views  
- Basic form validation and JavaScript confirmation before delete  
- Reusability of templates using Thymeleaf fragments

---

## 🗂️ Folder Structure

14-web-mvc-book-app/
├── controller/
│ └── BookController.java
├── entity/
│ └── Book.java
├── repository/
│ └── BookRepository.java
├── service/
│ └── BookService.java
├── templates/
│ ├── add-book.html
│ ├── edit-book.html
│ └── book-list.html
├── static/
│ └── (CSS/JS if needed)
└── Application.java

yaml
Copy
Edit

---

## 💡 How to Run

1. Clone the repository
2. Set your MySQL DB config in `application.properties`
3. Run the main class: `BookAppApplication.java`
4. Open your browser at `http://localhost:8080/books/list`

---

## 📸 Screenshots

> Add screenshots of the form, list view, and edit view (optional)

---

## 📌 Use Case

This project is useful for beginners learning how to:

- Build web applications using Spring MVC
- Implement CRUD operations using Spring Data JPA
- Handle form submissions and redirection
- Design MVC structure for backend logic and frontend UI

---

## 📂 Related Projects

- `13-web-mvc`: Basic Spring MVC setup  
- `15-web-mvc-validation`: Add form validation and custom error handling

---

## 📬 Connect

If you found this helpful, feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/aashutosh-shrivastava)
