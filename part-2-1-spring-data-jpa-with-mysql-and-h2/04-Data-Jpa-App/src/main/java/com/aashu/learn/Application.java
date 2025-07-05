package com.aashu.learn;

import com.aashu.learn.entity.Product;
import com.aashu.learn.entity.Student;
import com.aashu.learn.repository.ProductRepository;
import com.aashu.learn.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class 	Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		StudentRepository studentRepo =  context.getBean(StudentRepository.class);

//		Optional<Student> optional = studentRepo.findById(101);
//		if (optional.isPresent())
//		{
//			System.out.println(optional.get());
//		}
//
//		Iterable<Student> all = studentRepo.findAll();
//		all.forEach(System.out::println);


//		Student s = new Student();
//		s.setId(103);
//		s.setName("Ashok");
//		s.setStudentRank(1133l);
//		s.setGender("M");
//
//		studentRepo.save(s);
//
//		System.out.println("Record Inserted...");

//		studentRepo.deleteById(103);
//		System.out.println("Record deleted... ");

////		To check how much raws exist in the tables.
//		long count = studentRepo.count();
//		System.out.println("Records Count :: " + count);



//		Student s1 = new Student(104, "Aashu", 90l, "Male");
//		Student s2 = new Student(105, "Abhi", 60l, "Male");
//		Student s3 = new Student(106, "Rohit", 70l, "Male");
//		Student s4 = new Student(107, "Shallu", 80l, "Female");
//
//		List<Student> students = Arrays.asList(s1, s2, s3, s4);
//		studentRepo.saveAll(students);




//		List<Student> maleStudents = studentRepo.findByGender("M");
////		maleStudents.forEach(System.out::println);
//
//
//		List<Student> studentList =	studentRepo.findByStudentRankGreaterThanEqual(50l);
//		studentList.forEach(System.out::println);
//
//		List<Student> studentList1 = studentRepo.findByStudentRankLessThanEqual(100l);
//		studentList1.forEach(System.out::println);
//
//		List<Student> studentList2 = studentRepo.findByGenderAndStudentRankGreaterThanEqual("Male", 50l);
//		studentList2.forEach(System.out::println);


//		List<Student> allStudents = studentRepo.getAllStudents();
//		allStudents.forEach(System.out::println);

//		List<Student> Students = studentRepo.getStudents();
//		Students.forEach(System.out::println);



//		Pagination and sorting
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Page Number");
//		int pageNo = s.nextInt();
//		int pageSize = 3;

////		Page No will start from 0
//		PageRequest pageReq = PageRequest.of(pageNo-1, pageSize);
//		Page<Student> page = studentRepo.findAll(pageReq);

//		List<Student> students = page.getContent();
//		students.forEach(System.out::println);


//		Sorting
//		List<Student> students = studentRepo.findAll(Sort.by("gender"));
//		students.forEach(System.out::println);



//		Query
//		Student s = new Student();
//		s.setGender("M");
//		s.setStudentRank(90l);
//
//		Example<Student> example = Example.of(s);
//		List<Student> students = studentRepo.findAll(example);
//		students.forEach(System.out::println);


//		Student s = new Student(1, "Aashu", 111l, "Male", "Y");
//		Student s2 = studentRepo.findById(1).get();
//		s2.setActiveSw("N");
//
//		studentRepo.save(s2);
//		System.out.println("Record Saved...");


//		Custom Query

//		To delete the student
// 		studentRepo.deleteStudent(101);
// 		System.out.println("Deleted...");

////		to update the student
//		studentRepo.updateStudent(101, "Male");

////		to insert the record
//		studentRepo.insertStudent(106, "Gita", "Female");
//		System.out.println("inserted");


//		Sof and Hard delete
//		Student s = new Student(101, "Rani", 100l, "Female", "Y");
//		studentRepo.save(s);
//		System.out.println("Record Saved");


//		for soft delete
//		Student student = studentRepo.findById(101).get();
//		student.setActiveSW("N");
//		studentRepo.save(student);


//		#########################################################################
//		For Pk and for CompositeKey.

		ProductRepository productRepo = context.getBean(ProductRepository.class);
		Product p = new Product();
		p.setProductName("Keyboard");
		p.setProductPrice(200.00);

		productRepo.save(p);

		System.out.println("Product Inserted...");


	}
}
