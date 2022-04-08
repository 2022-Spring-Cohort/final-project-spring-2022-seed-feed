export default function home(plants) {
  return `
    <main class="mainContent">
    <div class="mainSection">

        <section>
       <h2 class="welcome">Welcome to Seed & Feed! A Modern Garden Planner and Recipe Finder</h2>
  <div class="textAndCheckbox">
  <div class="textAndZipBox">
    <h3 class="homeText" style="line-height:1.4">
    Enter your zip code, choose the plants you’d like for your garden, and voilà! We’ll tell you if you should begin the seeds indoors based on your area and when you should plant them outside.
    <br>
    <br>
    And, we know life gets busy, so we’ve got you covered! Add a calendar reminder with just a simple click.
    <br>
    <br>
    Check out the care tips and even browse our recipes page for inspiration on what to cook once your plant is ready to harvest!
    <br>
    <br>
   </h3>
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

    <input type="checkbox" name="veg_select" class="checkPlantName"><p class="plantNameCheck">${plant.name}</p><br>
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
    <h3>Thanks for stopping by and entrusting us with both your garden and your meals!</h3>
</main>
    
    
    `;
}

 
//   <button class="zipSubmitButton">subZIP</button> Line 9
