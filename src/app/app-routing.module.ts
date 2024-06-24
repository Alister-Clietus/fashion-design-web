import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DressComponent } from './dress/dress.component';


const routes: Routes = [
  {
    path:"dress",component:DressComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
