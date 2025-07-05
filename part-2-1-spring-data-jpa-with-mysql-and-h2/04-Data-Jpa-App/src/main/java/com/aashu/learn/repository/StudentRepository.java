package com.aashu.learn.repository;

import com.aashu.learn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
//    public List<Student> findByGender(String gender);


//
//    selelct * from student_dtls where student_rank >= : rank
//    public List<Student> findByStudentRankGreaterThanEqual(Long studentRank);
//
//    //    selelct * from student_dtls where student_rank <= : rank
//    public List<Student> findByStudentRankLessThanEqual(Long studentRank);
//
////    male students who are having rank >= 100; and findByGender also
////    select * from student_dtls where student_gender=? and student_rank >= : rank
//    public List<Student> findByGenderAndStudentRankGreaterThanEqual(String gender, Long studentRank);



//    custom query

//    to delete the student
//@Query("delete from Student where id = :sid")
//@Modifying
//@Transactional
//public void deleteStudent(Integer sid);

// to select the student
//@Query("from Student")
//public void selectStudents();

// to update the student
//@Query("update Student set gender=:gender where id=:sid")
//@Modifying
//@Transactional
//public Integer updateStudent(Integer sid, String gender);

// to insert the data : custom hql is not supporting this is native sql
//@Query(value = "insert into student_dtls(student_id,student_name,student_gender) values(:id, :name, :gender)", nativeQuery = true)
//@Modifying
//@Transactional
//public void insertStudent(Integer id, String name, String gender);

////    sql native query
//    @Query(value = "select * from student_dtls", nativeQuery = true)
//    public List<Student> getAllStudents();
//
////    HQL native query
//    @Query("from Student")
//    public List<Student> getStudents();

}