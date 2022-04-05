export default function home(plants) {
  return `
    <main class="mainContent">
    <div class="mainSection">
    <h1>Want to start a garden, but don't know when to plant?</h1>
   
    <div class="zipcodeSection">
   <input type="text" maxlength="5" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\/g, '$1');" class="zipcode" placeholder="Enter Your Zipcode"> 

    <br>
   </div>

 
 

        <section>
       
   
    <legend>Plants to check</legend>  
       <fieldset>
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
           
              <input type="submit" class="submitButton" value="Submit now">  

    </section>
  
    <br>
    <img class="vegImg" src="img/veg.png">

    </div>
</main>
    
    
    `;
}

//   <button class="zipSubmitButton">subZIP</button> Line 9
