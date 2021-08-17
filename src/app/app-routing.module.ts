import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobDescriptionComponent } from './description/job-description/job-description.component';
import { JobHistoryComponent } from './history/job-history/job-history.component';
import { JobListComponent } from './list/job-list/job-list.component';
import { RegisterComponent } from './register/register/register.component';
import { JobSearchComponent } from './search/job-search/job-search.component';

const routes: Routes = [
  { path: 'register', component: RegisterComponent },
  { path: 'search', component: JobSearchComponent},
  { path: 'list', component: JobListComponent},
  { path: 'details', component: JobDescriptionComponent},
  { path: 'history', component: JobHistoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
