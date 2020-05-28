package com.example.backendHireviews.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person2
{
    @Id
    String id;

    String companyName;
    String companyDescription;
    String jobType;
    String jobDescription;
    String companyWebsite;
    String email;
    String jobLocation;
    String rate;
    String skills;
    String benefits;
    String experience;
    String jobTitle;
    String fbUsername;
    String ldUsername;
    String stipend;
    String salary;






    public Person2
            (String email, String jobTitle, String jobType,
             String jobDescription, String companyName, String companyDescription,
             String companyWebsite, String fbUsername, String ldUsername,String stipend,
             String salary, String jobLocation, String rate,
                     String skills,
                     String benefits,
                     String experience)
    {
        this.email = email;
        this.jobTitle = jobTitle;
        this.jobType = jobType;
        this.jobDescription = jobDescription;
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.companyWebsite = companyWebsite;
        this.fbUsername = fbUsername;
        this.ldUsername = ldUsername;
        this.stipend=stipend;
        this.salary=salary;
        this.jobLocation=jobLocation;
        this.rate=rate;
        this.skills=skills;
        this.benefits=benefits;
        this.experience=experience;
    }
    @Override
    public String toString()
    {
        return "Person1{" +
                "email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobType='" + jobType + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyDescription='" + companyDescription + '\'' +
                ", companyWebsite='" + companyWebsite + '\'' +
                ", fbUsername='" + fbUsername + '\'' +
                ", ldUsername='" + ldUsername + '\'' +
                ", stipend='" + stipend + '\'' +
                ", salary='" + salary + '\'' +
                ", jobLocation='" + jobLocation + '\'' +
                ", rate='" + rate + '\'' +
                ", skills='" + skills + '\'' +
                ", benefits='" +benefits + '\'' +
                ", experience='" + experience + '\'' +

                '}';
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getStipend() {
        return stipend;
    }

    public void setStipend(String stipend) {
        this.stipend = stipend;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getFbUsername() {
        return fbUsername;
    }

    public void setFbUsername(String fbUsername) {
        this.fbUsername = fbUsername;
    }

    public String getLdUsername() {
        return ldUsername;
    }

    public void setLdUsername(String ldUsername) {
        this.ldUsername = ldUsername;
    }
}
