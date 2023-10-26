import { Component, OnInit } from '@angular/core';
import { TypicodeService } from '../service/typicode.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

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
