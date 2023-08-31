public class Person {
    
    String surname;

    String name;

    String patronymic;

    int phone;


    public Person(String surname, String name, String patronymic, int phone) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phone = phone;
    }

    public Person(){
        surname = null;
        name = null;
        patronymic = null;
        phone = 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Пользователь " + "<" + surname + ">"+ "<" + name + ">"+ "<" + patronymic +">"+"<" + phone + ">";
    }
    
    // /**
    //  * Getting user datas method. Return data array in String format:  
    //  */
    // public String[] userDate (String date) throws IOException {
        
    //     String [] userDate = date.split(" ");
    //     return userDate;

    // }
}