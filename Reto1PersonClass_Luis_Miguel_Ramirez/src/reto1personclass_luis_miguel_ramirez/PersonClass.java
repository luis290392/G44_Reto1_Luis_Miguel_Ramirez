/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1personclass_luis_miguel_ramirez;

/**
 *
 * @author lmram
 */
public class PersonClass {
  private String name;
  private char gender;
  private String date_of_birth;
  private String type_of_document;
  private int document_number;
  private String profession;
  private char employer_type;
  private boolean currently_working;
  private boolean sports_fan;
  private String sport_name;
  private boolean sports_pactice;
  private char nationality_type;
  private String colombian_city_name;

    public PersonClass(String name, char gender, String date_of_birth, String type_of_document, int document_number, String profession, char employer_type, boolean currently_working, boolean sports_fan, String sport_name, boolean sports_pactice, char nationality_type, String colombian_city_name) {
        this.name = name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.type_of_document = type_of_document;
        this.document_number = document_number;
        this.profession = profession;
        this.employer_type = employer_type;
        this.currently_working = currently_working;
        this.sports_fan = sports_fan;
        this.sport_name = sport_name;
        this.sports_pactice = sports_pactice;
        this.nationality_type = nationality_type;
        this.colombian_city_name = colombian_city_name;
    }

   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the date_of_birth
     */
    public String getDate_of_birth() {
        return date_of_birth;
    }

    /**
     * @param date_of_birth the date_of_birth to set
     */
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    /**
     * @return the document_number
     */
    public int getDocument_number() {
        return document_number;
    }

    /**
     * @param document_number the document_number to set
     */
    public void setDocument_number(int document_number) {
        this.document_number = document_number;
    }

    /**
     * @return the profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession the profession to set
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return the employer_type
     */
    public char getEmployer_type() {
        return employer_type;
    }

    /**
     * @param employer_type the employer_type to set
     */
    public void setEmployer_type(char employer_type) {
        this.employer_type = employer_type;
    }

    /**
     * @return the currently_working
     */
    public boolean isCurrently_working() {
        return currently_working;
    }

    /**
     * @param currently_working the currently_working to set
     */
    public void setCurrently_working(boolean currently_working) {
        this.currently_working = currently_working;
    }

    /**
     * @return the sports_fan
     */
    public boolean isSports_fan() {
        return sports_fan;
    }

    /**
     * @param sports_fan the sports_fan to set
     */
    public void setSports_fan(boolean sports_fan) {
        this.sports_fan = sports_fan;
    }

    /**
     * @return the sport_name
     */
    public String getSport_name() {
        return sport_name;
    }

    /**
     * @param sport_name the sport_name to set
     */
    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
    }

    /**
     * @return the sports_pactice
     */
    public boolean isSports_pactice() {
        return sports_pactice;
    }

    /**
     * @param sports_pactice the sports_pactice to set
     */
    public void setSports_pactice(boolean sports_pactice) {
        this.sports_pactice = sports_pactice;
    }

    /**
     * @return the nationality_type
     */
    public char getNationality_type() {
        return nationality_type;
    }

    /**
     * @param nationality_type the nationality_type to set
     */
    public void setNationality_type(char nationality_type) {
        this.nationality_type = nationality_type;
    }

    /**
     * @return the colombian_city_name
     */
    public String getColombian_city_name() {
        return colombian_city_name;
    }

    /**
     * @param colombian_city_name the colombian_city_name to set
     */
    public void setColombian_city_name(String colombian_city_name) {
        this.colombian_city_name = colombian_city_name;
    }
  
    public void Basic_Info_Person(){
      System.out.println("Basic information of the person:  \n      >>Name: " + getName()+ "\n      >>Gender: " + getGender()+ "\n      >>Date of Birth: " + getDate_of_birth()+ "\n      >>Type of document: " +getType_of_document()+ "\n      >>Document Number: " +getDocument_number());
              
    }

    /**
     * @return the type_of_document
     */
    public String getType_of_document() {
        return type_of_document;
    }

    /**
     * @param type_of_document the type_of_document to set
     */
    public void setType_of_document(String type_of_document) {
        this.type_of_document = type_of_document;
    }
  
    public void work(){ 
        System.out.println("\nProfessional profile:   \n      >>Profession: " + getProfession()+ "\n      >>Employeer type(State(S),Private(P)): " + getEmployer_type() + "\n      >>Are you currently working? " + isCurrently_working() );
    }
    
    public void Sports_Practice(){
        System.out.println("\nSports profile:   \n      >>Are you a sports Fan? " + isSports_fan() + "\n      >>What sport do you like? " + getSport_name() + "\n      >>Do you practice any sport? " + isSports_pactice());
    }
       
    public void City_Of_Living(){
        System.out.println("\nPlace of origin:    \n      >>Type of nationality (Foreigner(F),Colombian(C)): " + getNationality_type() + "\n      >>What is your City of residence? " + getColombian_city_name());
    }
}
