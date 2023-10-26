import { Component, OnInit } from '@angular/core';
import { TypicodeService } from '../service/typicode.service';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css']
})
export class CardsComponent implements OnInit {

  filterPost = '';


    info:any[];
   
    constructor(private typicodeService:TypicodeService){
    
  }

  ngOnInit(){
    this.typicodeService.getUsers().subscribe(data => {
      this.info=data;
    })
  }

}
