import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ToneSelectorComponent } from './tone-selector/tone-selector.component';
import { DressComponent } from './dress/dress.component';


const routes: Routes = 
[
  { path: 'toneselector', component:ToneSelectorComponent},
  { path: 'dress', component:DressComponent},

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainModuleRoutingModule { }
