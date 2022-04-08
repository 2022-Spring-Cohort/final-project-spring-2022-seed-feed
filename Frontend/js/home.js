export default function home(plants) {
  return `
    <main class="mainContent">
    <div class="mainSection">

        <section>
       
  <div class="textAndCheckbox">
  <div class="textAndZipBox">
    <h3 class="homeText">Welcome to Seed & Feed, a modern garden planner and recipe finder!
   <br>
   <br>
    Just enter your zip code, choose the plants you’d like for your garden, and voila! We’ll tell you if you should begin the seeds indoors based on your area and when you should plant them outside.
    <br>
    <br>
    And, we know life gets busy, so we’ve got you covered! Add a calendar reminder with just a simple click.
    <br>
    <br>
    Check out the care tips and even browse our recipes page for inspiration on what to cook once your plant is ready to harvest!
    <br>
    <br>
    Thanks for stopping by and entrusting us with both your garden and your meals!</h3>
    <br>
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
    <input type="submit" class="submitButton" value="See My Garden Plan"> 
  
    <br>


    </div>
</main>
    
    
    `;
}

 
//   <button class="zipSubmitButton">subZIP</button> Line 9
