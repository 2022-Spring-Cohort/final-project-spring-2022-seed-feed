export default function home(plants) {
  return `
    <main class="mainContent">
        <section class="mainSection">

      
  <div class="homeSection">    
<div class="zipcodeSection">
<h1 class="homeText" style="line-height:2">
       Enter your zip code, choose the plants you’d like for your garden, and voilà! <br><br>We’ll tell you if you should begin the seeds indoors based on your area and when you should plant them outside.
       <br>
      </h1>
 <div class="zipDiv">     
<input alt="Enter a 5 digit zipcode here" type="text" maxlength="5" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\/g, '$1');" class="zipcode" placeholder="Enter Your Zipcode"> 
</div>
<img src="./img/gardenBtn.png" input type="submit" class="submitButton"> 
</div>
  <div class="checkBox">
    <fieldset class="checkList">
     ${plants
       .map((plant) => {
         return `
<div class="checkbox_input">
    <input type="checkbox" id="${plant.id}" name="${plant.id}" class="checkPlantName">
     <label for="${plant.id}" class="plantNameCheck">${plant.name}</label>
 <br>
  <input type="hidden" class="veg_id" value="${plant.id}">
        <br>   
   
</div>

 `;
       })
       .join("")} 
       
           </fieldset> 

           </div>
</div>
           
           </section>
   
    <br>
    <div class="goodbye">
    <h1 >Thanks for stopping by and entrusting us with both your garden and your meals!</h1>
</div>
    </main>
    
    
    `;
}

 
//   <button class="zipSubmitButton">subZIP</button> Line 9
