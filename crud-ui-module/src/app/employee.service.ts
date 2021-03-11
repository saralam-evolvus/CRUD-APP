import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
   
  private baseUrl = "http://localhost:8080/emp/employees";
  
  constructor( private http : HttpClient) { }


  // Get all  the employees 
  getEmployeesList(): Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.baseUrl}`);
  }

  // Create new employee
  createEmployee(employee: Employee) :Observable<Object>{
    return this.http.post(`${this.baseUrl}`,employee);
  }

  //Get employee by id
  getEmployeeById(id: number):Observable<Employee>{
    return this.http.get<Employee>(`${this.baseUrl}/${id}`);
  }

  //Update employee using id
  updateEmployee(id:number, employee: Employee):Observable<Employee>{
    return this.http.put<Employee>(`${this.baseUrl}/${id}`,employee);
  }

  //Delete employee by id
  deleteEmployee(id:number):Observable<Object>{
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

}
