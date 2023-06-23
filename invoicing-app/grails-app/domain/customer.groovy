package com.example

class Customer {
    String name
    String email
    Phone

    static hasMany = [invoices: Invoice]

    static constraints = {
        name blank: false
        email email: true
    }
}