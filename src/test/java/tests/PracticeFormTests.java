package tests;

import manager.ApplicationManager;
import manager.dto.StudentDTO;
import manager.enums.Gender;
import manager.enums.Hobbies;
import manager.enums.StateCity;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends ApplicationManager {


    @Test
    public void practiceFormPositiveTest() {
        List<Hobbies> listHobbies = new ArrayList<>();
        listHobbies.add(Hobbies.SPORTS);
        listHobbies.add(Hobbies.MUSIC);

        StudentDTO student = new StudentDTO("Steve","Silver","silver123@gmail.com",Gender.OTHER,
                "1234567890","12 Sep 1900","Math, Physics, Economics",listHobbies,"","Haifa st 1 app 2",
                StateCity.UTTAR_PRADESH.getState(), StateCity.UTTAR_PRADESH.getCity()[2]);

//        StudentDTO student = new StudentDTO();
//        student.setName("Steve");
//        student.setLastName("Silver");
//        student.setEmail("silver123@gmail.com");
//        student.setGender(Gender.OTHER);


        new HomePage(getDriver())
                .clickBtnForms()
                .clickBtnPracticeForm()
                .fillStudentsForm(student)
                .clickBtnSubmit();
    }

}
