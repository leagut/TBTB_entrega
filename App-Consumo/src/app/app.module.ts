import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CardsComponent } from './cards/cards.component';
import { TableComponent } from './table/table.component';
import { RouterModule , Routes} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FilterPipe } from './pipes/filter.pipe';



const routes: Routes = [
  { path: '', redirectTo: 'table', pathMatch: 'full' },
  { path: 'cards', component:CardsComponent},
  { path: 'table', component:TableComponent}
];

@NgModule({
  declarations:[
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CardsComponent,
    TableComponent,
    FilterPipe,
    
  ],
  imports: [
    BrowserModule, 
    FormsModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
