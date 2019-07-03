package ke.co.mih.pubs_erp.model;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private SimpleStringProperty user_id;
    private SimpleStringProperty first_name;
    private SimpleStringProperty last_name;
    private SimpleStringProperty other_name;
    private SimpleStringProperty phone_number;
    private SimpleStringProperty email;
    private SimpleStringProperty id_number;
    private SimpleStringProperty username;
    private SimpleStringProperty password;
    private SimpleStringProperty date_employed;
    private SimpleStringProperty user_role;
    private SimpleStringProperty simage;
    private SimpleStringProperty date_of_birth;
    private SimpleStringProperty gender;
    private SimpleStringProperty postal_address;
    private SimpleStringProperty residence;
    private SimpleStringProperty nhif_number;
    private SimpleStringProperty nssf_number;
    private SimpleStringProperty huduma_number;
    private SimpleStringProperty kra_pin;

    public User(
            String user_id, String first_name, String last_name, String other_name, String phone_number, String email,
            String id_number, String username, String password, String date_employed, String user_role, String simage,
            String date_of_birth, String gender, String postal_address, String residence, String nhif_number,
            String nssf_number, String huduma_number, String kra_pin
    ) {
        this.user_id = new SimpleStringProperty(user_id);
        this.first_name = new SimpleStringProperty(first_name);
        this.last_name = new SimpleStringProperty(last_name);
        this.other_name = new SimpleStringProperty(other_name);
        this.phone_number = new SimpleStringProperty(phone_number);
        this.email = new SimpleStringProperty(email);
        this.id_number = new SimpleStringProperty(id_number);
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.date_employed = new SimpleStringProperty(date_employed);
        this.user_role = new SimpleStringProperty(user_role);
        this.simage = new SimpleStringProperty(simage);
        this.date_of_birth = new SimpleStringProperty(date_of_birth);
        this.gender = new SimpleStringProperty(gender);
        this.postal_address = new SimpleStringProperty(postal_address);
        this.residence = new SimpleStringProperty(residence);
        this.nhif_number = new SimpleStringProperty(nhif_number);
        this.nssf_number = new SimpleStringProperty(nssf_number);
        this.huduma_number = new SimpleStringProperty(huduma_number);
        this.kra_pin = new SimpleStringProperty(kra_pin);
    }

    public String getUser_id() {
        return user_id.get();
    }

    public void setUser_id(String user_id) {
        this.user_id.set(user_id);
    }

    public String getFirst_name() {
        return first_name.get();
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getLast_name() {
        return last_name.get();
    }

    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }

    public String getOther_name() {
        return other_name.get();
    }

    public void setOther_name(String other_name) {
        this.other_name.set(other_name);
    }

    public String getPhone_number() {
        return phone_number.get();
    }

    public void setPhone_number(String phone_number) {
        this.phone_number.set(phone_number);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getId_number() {
        return id_number.get();
    }

    public void setId_number(String id_number) {
        this.id_number.set(id_number);
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getDate_employed() {
        return date_employed.get();
    }

    public void setDate_employed(String date_employed) {
        this.date_employed.set(date_employed);
    }

    public String getUser_role() {
        return user_role.get();
    }

    public void setUser_role(String user_role) {
        this.user_role.set(user_role);
    }

    public String getSimage() {
        return simage.get();
    }

    public void setSimage(String simage) {
        this.simage.set(simage);
    }

    public String getDate_of_birth() {
        return date_of_birth.get();
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth.set(date_of_birth);
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getPostal_address() {
        return postal_address.get();
    }

    public void setPostal_address(String postal_address) {
        this.postal_address.set(postal_address);
    }

    public String getResidence() {
        return residence.get();
    }

    public void setResidence(String residence) {
        this.residence.set(residence);
    }

    public String getNhif_number() {
        return nhif_number.get();
    }

    public void setNhif_number(String nhif_number) {
        this.nhif_number.set(nhif_number);
    }

    public String getNssf_number() {
        return nssf_number.get();
    }

    public void setNssf_number(String nssf_number) {
        this.nssf_number.set(nssf_number);
    }

    public String getHuduma_number() {
        return huduma_number.get();
    }

    public void setHuduma_number(String huduma_number) {
        this.huduma_number.set(huduma_number);
    }

    public String getKra_pin() {
        return kra_pin.get();
    }

    public void setKra_pin(String kra_pin) {
        this.kra_pin.set(kra_pin);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", first_name=" + first_name +
                ", last_name=" + last_name +
                ", other_name=" + other_name +
                ", phone_number=" + phone_number +
                ", email=" + email +
                ", id_number=" + id_number +
                ", username=" + username +
                ", password=" + password +
                ", date_employed=" + date_employed +
                ", user_role=" + user_role +
                ", simage=" + simage +
                ", date_of_birth=" + date_of_birth +
                ", gender=" + gender +
                ", postal_address=" + postal_address +
                ", residence=" + residence +
                ", nhif_number=" + nhif_number +
                ", nssf_number=" + nssf_number +
                ", huduma_number=" + huduma_number +
                ", kra_pin=" + kra_pin +
                '}';
    }
}