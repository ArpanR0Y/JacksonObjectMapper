package Model

class Person {
    private String name;
    private String email;
    private int age;
    private String address;
    private String city;
    private String country;

    Person(String name, String email, int age, String address, String city, String country) {
        this.name = name
        this.email = email
        this.age = age
        this.address = address
        this.city = city
        this.country = country
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getAddress() {
        return address
    }

    void setAddress(String address) {
        this.address = address
    }

    String getCity() {
        return city
    }

    void setCity(String city) {
        this.city = city
    }

    String getCountry() {
        return country
    }

    void setCountry(String country) {
        this.country = country
    }
}
