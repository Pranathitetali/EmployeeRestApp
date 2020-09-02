
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employee resource
 * <p>
 * Employee resource object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "dob",
    "address_line1",
    "address_line2",
    "city",
    "state",
    "country",
    "zip_code"
})
public class Employee {

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("employee id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @DecimalMin("1")
    private Integer id;
    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("first name")
    @Size(min = 1, max = 255)
    @NotNull
    private String firstName;
    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("last name")
    @Size(min = 1, max = 255)
    @NotNull
    private String lastName;
    /**
     * employee dob
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "UTC")
    @JsonProperty("dob")
    @JsonPropertyDescription("employee dob")
    @NotNull
    private Date dob;
    /**
     * employee address Line 1
     * (Required)
     * 
     */
    @JsonProperty("address_line1")
    @JsonPropertyDescription("employee address Line 1")
    @Size(min = 1, max = 255)
    @NotNull
    private String addressLine1;
    /**
     * employee address Line 2
     * 
     */
    @JsonProperty("address_line2")
    @JsonPropertyDescription("employee address Line 2")
    @Size(min = 1, max = 255)
    private String addressLine2;
    /**
     * employee city
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("employee city")
    @Size(min = 1, max = 255)
    @NotNull
    private String city;
    /**
     * employee state
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("employee state")
    @Size(min = 1, max = 255)
    @NotNull
    private String state;
    /**
     * employee country
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("employee country")
    @Size(min = 1, max = 255)
    @NotNull
    private String country;
    /**
     * employee zipcode
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("employee zipcode")
    @Pattern(regexp = "(^[0-9]{5}$)|(^[0-9]{9}$)|(^[0-9]{5}-[0-9]{4}$)")
    @NotNull
    private String zipCode;

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * employee dob
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public Date getDob() {
        return dob;
    }

    /**
     * employee dob
     * (Required)
     * 
     */
    @JsonProperty("dob")
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * employee address Line 1
     * (Required)
     * 
     */
    @JsonProperty("address_line1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * employee address Line 1
     * (Required)
     * 
     */
    @JsonProperty("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * employee address Line 2
     * 
     */
    @JsonProperty("address_line2")
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * employee address Line 2
     * 
     */
    @JsonProperty("address_line2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * employee city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * employee city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * employee state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * employee state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * employee country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * employee country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * employee zipcode
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * employee zipcode
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dob");
        sb.append('=');
        sb.append(((this.dob == null)?"<null>":this.dob));
        sb.append(',');
        sb.append("addressLine1");
        sb.append('=');
        sb.append(((this.addressLine1 == null)?"<null>":this.addressLine1));
        sb.append(',');
        sb.append("addressLine2");
        sb.append('=');
        sb.append(((this.addressLine2 == null)?"<null>":this.addressLine2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
