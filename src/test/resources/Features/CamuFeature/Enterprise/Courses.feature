@Courses
Feature: Courses Creation and Modification-->CamuJupiter

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Courses" submodule under Enterprise module
    
  @COU-01
  Scenario Outline: Course Creation with passing string values
  	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "CS"
    And the user can pass the Course name "Computer-"
    And the user can select the offering department for the course "CSE"
    And the user can pass the display code "CS"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    And the user can select the course category "CSE"
    And the user can select the sub category "Part-",""
    And the user can pass the start date of the course "25-Mar-2024"
    And the user can pass the end date of the course "30-Nov-2026"
    And the usee can pass the capacity of the course "50"
    And the user can verify the status automatically selected as "Active"
    And the user can select the course type "Theory"
    And the user can enable the Non academic course by using checkbox
    And the user can enable the Exclude from graduation criteria by using checkbox
    And the user can verify the minimum qualifying GPA field is disabled
    And the user can verify self study is enabled
    Then the user can verify minimum qualifying gpa field visible "5" 
    And the user can enable the Exclude from GPA CGPA
    And the user can enable the No Arrear classes by using checkbox
    And the user can enable the Exclude miscellaneous fees
    And the user can verify the grading system is disabled
    And the user can enable the Alphabetical result
    And the user can verify the grading system is enabled and select the grading system "IA"
    And the user can enable the equivalent course
    Then the user can view and select the course "19CS102"
    When the user can pass the course overview description "Course overview description"
    And the user can upload the file for course overview
    And the user can enable pre-requisite course 
    Then the user can view the mandatory and non mandatory titles
    When the user can add the pre-requisite mandatory courses by clicking add Course button
    Then the user can view pass and select the pre-requisite mandatory course "R21-CS03"
    And the user can select the grade limit for the mandatory course "A"
    And the user can add the pre-requisite non-mandatory courses by clicking add Course button
    Then the user can view pass and select the pre-requisite non-mandatory course "R21-CS02"
    And the user can select the grade limit for the non-mandatory course "A"
    And the user can enable the Co-requisite checkbox
    Then the user can view pass and select the co-requisite course "24CSE001"
    When the user can enable the enrollment course fee
    Then the user can see the list of option 
    When the user can enable the auto exempt course 
    Then the user can view and pass the grade point "70"
    And the user can view and pass the auto exempt course "24CSE002"
    When the user can enable the mandatory course 
    Then the user verify auto exempt course disabled while enable mandatory course
    When the user can enable the Defer course
    And the user can pass the number of semester "3"
    And the user can enable the LPT Hours
    And the user can pass the Lecture hours "50"
    And the user can pass the practical hours "40"
    And the user can pass the tutorial hours "30"
    And the user can save the course by using save button
    Then the user can verify the saved confirmation message
    
    
  @COU-02
  Scenario Outline: Course Creation with passing Mandatory fields alone
    Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "MAN"
    And the user can pass the Course name "MANDITORY-"
    And the user can save the course by using save button
    Then the user can verify the saved confirmation message
    
  @COU-03
  Scenario Outline: Course Creation with passing duplicate data  
    Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate Course ID "R21-CS01"
    And the user can pass the duplicate Course name "Programming In Java"
    And the user can save the course by using save button
    Then the user can verify duplicate error message
  
  @COU-04  
  Scenario Outline: Course creation - verify Default credit and Faculty credit does not allow alphabets 
  	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "MAN"
    And the user can pass the Course name "MANDITORY-"
    And the user can pass the default credit for the course "A"
    Then the user verify default credit does not allows alphabets
    When the user can pass the faculty credit for the course "B"
    Then the user can verify faculty credit does not allows alphabets
  
  @COU-05
  Scenario Outline: Reset the created new Course Details
  	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "CS"
    And the user can pass the Course name "Computer-"
    And the user can select the offering department for the course "CSE"
    And the user can pass the display code "CS"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    And the user can select the course category without creation "Mandatory"
    And the user can select the sub category without creation "Part-1-1"
   And the user can pass the start date of the course "25-Mar-2024"
   And the user can pass the end date of the course "30-Nov-2026"
    And the usee can pass the capacity of the course "50"
    And the user can verify the status automatically selected as "Active"
    And the user can select the course type "Theory"
    And the user can enable the Non academic course by using checkbox
    And the user can enable the Exclude from graduation criteria by using checkbox
    And the user can verify the minimum qualifying GPA field is disabled
    And the user can verify self study is enabled
    Then the user can verify minimum qualifying gpa field visible "5" 
    And the user can enable the Exclude from GPA CGPA
    And the user can enable the No Arrear classes by using checkbox
    And the user can enable the Exclude miscellaneous fees
    And the user can verify the grading system is disabled
    And the user can enable the Alphabetical result
    And the user can verify the grading system is enabled and select the grading system "IA"
    And the user can enable the equivalent course
    Then the user can view and select the course "19CS102"
    When the user can pass the course overview description "Course overview description"
    And the user can upload the file for course overview
    And the user can enable pre-requisite course 
    Then the user can view the mandatory and non mandatory titles
    When the user can add the pre-requisite mandatory courses by clicking add Course button
    Then the user can view pass and select the pre-requisite mandatory course "R21-CS03"
    And the user can select the grade limit for the mandatory course "A"
    And the user can add the pre-requisite non-mandatory courses by clicking add Course button
    Then the user can view pass and select the pre-requisite non-mandatory course "R21-CS02"
    And the user can select the grade limit for the non-mandatory course "A"
    And the user can enable the Co-requisite checkbox
    Then the user can view pass and select the co-requisite course "24CSE001"
    When the user can enable the enrollment course fee
    Then the user can see the list of option 
    When the user can enable the auto exempt course 
    Then the user can view and pass the grade point "70"
    And the user can view and pass the auto exempt course "24CSE002"
    When the user can enable the mandatory course 
    Then the user verify auto exempt course disabled while enable mandatory course
    When the user can enable the Defer course
    And the user can pass the number of semester "3"
    And the user can enable the LPT Hours
    And the user can pass the Lecture hours "50"
    And the user can pass the practical hours "40"
    And the user can pass the tutorial hours "30"
    And the user can reset the details by clicking reset button 
  	Then the user can verify all the text field are resetted
  	And the user can verify all the dropdown selection are resetted
  	
  @COU-06
  Scenario Outline: Cancel the created courses details
  	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "CS"
    And the user can pass the Course name "Computer-"
    And the user can select the offering department for the course "CSE"
    And the user can pass the display code "CS"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    And the user can select the course category without creation "Mandatory"
    And the user can select the sub category without creation "Part-1-1"
    And the user can pass the start date of the course "25-Mar-2024"
    And the user can pass the end date of the course "30-Nov-2026"
    And the usee can pass the capacity of the course "50"
    And the user can verify the status automatically selected as "Active"
    And the user can select the course type "Theory"	
    Then the user can cancel the created details by clicking cancel button
    Then the user verify the page navigated to Courses screen 
    
  @COU-07
  Scenario Outline: Course creation without mandatory fields
  	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can select the offering department for the course "CSE"
    And the user can pass the display code "CS"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    Then the user can verify the save button is disabled
  	
  @COU-08
  Scenario Outline: Search the course and navigate to edit page
  	Then the user verify the page navigated to Courses screen
  	When the user pass the course in the search bar "CS64*1"
  	And the user can view the filtered course "CS64*1"
  	And the user can navigate to Edit page by clicking edit button "CS64*1"
  	Then the user can verify the user lands on edit page
  	#And the user can pass the duplicate Course ID "CS64*1"
    #And the user can pass the duplicate Course name "Programming languages"
    And the user can select the offering department for the course "ADD_1"
    And the user can pass the display code "CS6451"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    And the user can select the course category without creation "Mandatory"
    And the user can select the sub category without creation "Part-1-1"
    And the user can pass the start date of the course "25-Mar-2024"
    And the user can pass the end date of the course "30-Nov-2026"
    And the usee can pass the capacity of the course "40"
    And the user can verify the status automatically selected as "Deactivate"
    And the user can select the course type "Practical"
    Then the user can verify minimum qualifying gpa field visible "10" 
    And the user can verify the grading system is enabled and select the grading system "EA"
    Then the user can view and select the course "19CS101"
    When the user can pass the course overview description "Course overview description"
    And the user can upload the file for course overview
    Then the user can view pass and select the pre-requisite mandatory course "24CS101"
    And the user can select the grade limit for the mandatory course "O"
    Then the user can view pass and select the pre-requisite non-mandatory course "24CSE005"
    And the user can select the grade limit for the non-mandatory course "O"
    Then the user can view pass and select the co-requisite course "24CSE006"
    When the user can enable the mandatory course 
    When the user can enable the Defer course
    And the user can pass the number of semester "5"
    And the user can enable the LPT Hours
    And the user can pass the Lecture hours "30"
    And the user can pass the practical hours "40"
    And the user can pass the tutorial hours "50"
    
   @COU-09
   Scenario Outline: Course creation - verify split credit
   	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "CS"
    And the user can pass the Course name "Computer-"
    And the user can select the offering department for the course "CSE"
    And the user can pass the display code "CS"
    And the user can pass the default credit for the course "4"
    And the user can pass the faculty credit for the course "2"
    And the user can select the course type "Theory cum Practical"
    Then the user can view the split credit is enabled
    And the user can view the Theory and practical column
    And the user can pass the theory credit "2"
    And the user can pass the practical credit "2"
    And the user can save the course by using save button
    Then the user can verify the saved confirmation message
    
   @COU-10
   Scenario Outline: Enable Enrollment course fee - Fixed fee type
   	Then the user verify the page navigated to Courses screen 
  	When the user create new course by clicking on Add button
    Then the user verify the page navigated to create course screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the Course ID "CS"
    And the user can pass the Course name "Computer-"
    And the user can select the offering department for the course "CSE"
    And the user can select the course type "Theory"
    When the user can enable the enrollment course fee
    Then the user can see the list of option 
    When the user can enable the option "F"
    And the user can pass the bill item "TF"
    And the user can save the course by using save button
    Then the user can verify the saved confirmation message
    
   	
   @COU-11
   Scenario Outline: Edit Course - Enable Variable fee type
    When the user pass the course in the search bar "CS374<"
  	And the user can view the filtered course "CS374<"
  	And the user can navigate to Edit page by clicking edit button "CS374<"
  	Then the user can verify the user lands on edit page
  	When the user can enable the enrollment course fee
  	Then the user can see the list of option 
    When the user can enable the option "V"
    #Then the user can view the coure type "THEORY FEE"
    And the user can pass and select the bill item "THEORY FEE"
    And the user can save the course by using save button
    Then the user can verify the updated confirmation message
   	
    
  
    
    
  	
  	
    
  	