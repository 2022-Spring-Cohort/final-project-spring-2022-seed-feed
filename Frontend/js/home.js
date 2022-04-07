export default function home(plants) {
  return `
    <main class="mainContent">
    <div class="mainSection">
   


 
 

        <section>
       
   
    
  <div class="textAndCheckbox">
  <div class="textAndZipBox">
    <h2 class="homeText">Lorem ipsum dolor sit amet consectetur.orem ipsum dolor sit amet consectetur.orem ipsum dolor sit amet consectetur.orem ipsum dolor sit amet consectetur.orem ipsum dolor sit amet consectetur.orem ipsum dolor sit amet consectetur.</h2>
    <div class="zipcodeSection">
    <input type="text" maxlength="5" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\/g, '$1');" class="zipcode" placeholder="Enter Your Zipcode"> 
     <br>
    </div>
    </div>
    
    <fieldset class="checkList">
    
       
     ${plants
       .map((plant) => {
         return `

<div class="checkbox_input">
    <input type="checkbox" name="veg_select">
    ${plant.name}<br>  
  <input type="hidden" class="veg_id" value="${plant.id}">
        <br>  
      
</div>

 
 `;
       })
       .join("")} 
           </fieldset> 
           </div>
           
    </section>
    <input type="submit" class="submitButton" value="Submit now"> 
  
    <br>
    <img class="vegImg" src="img/veg.png">

    </div>
</main>
    
    
    `;
}

 
//   <button class="zipSubmitButton">subZIP</button> Line 9
