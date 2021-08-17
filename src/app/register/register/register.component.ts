import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public registerForm: any;
  constructor(
    private formBuilder: FormBuilder
  ) { 
    this.createForm();
  }

  ngOnInit(): void {
  }

  createForm(): void {
    this.registerForm = this.formBuilder.group({
      name:'',
      expertise:'',
      email:'',
      resumeFile:''
    });
  }

  register(): void {
    console.log(this.registerForm.value);
  }

}
