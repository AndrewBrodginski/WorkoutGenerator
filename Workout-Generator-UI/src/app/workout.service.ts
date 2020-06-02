import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WorkoutService {


  private baseUrl = 'http://localhost:8080/api/workouts';

  constructor(private http: HttpClient) { }

  getWorkout(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createWorkout(workout: any): Observable<any> {
    return this.http.post(this.baseUrl, workout);
  }

  updateWorkout(id: number, value: any): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteWorkout(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }

  getWorkoutsList(): Observable<any> {
    return this.http.get(this.baseUrl);
  }

  getWorkoutsByType(type: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/type/${type}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(this.baseUrl);
  }
}
