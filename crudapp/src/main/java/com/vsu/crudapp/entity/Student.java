package com.vsu.crudapp.entity;

import jakarta.persistence.*;

@Entity
@Table

public class Student
{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column
    private long id;
    @Column
    private String name;
    @Column
    private int rollno;
    @Column
    private float marks;

    public long getId()
    {
        return id;
    }

    public void setId(long id) 
    {
        this.id = id;
    }

    public float getMarks() 
    {
        return marks;
    }


    public void setMarks(float marks)
    {
        this.marks = marks;
    }

    public int getRollno() 
    {
        return rollno;
    }

    public void setRollno() 
    {
        this.rollno = rollno;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
