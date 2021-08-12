import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register/register.component';
import { JobSearchComponent } from './search/job-search/job-search.component';

const routes: Routes = [
  { path: 'register', component: RegisterComponent },
  { path: 'search', component: JobSearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
