export default function home(plants) {
  return `
    <main class="mainContent">
        <section class="mainSection">

      
  <div class="homeSection">    
<div class="zipcodeSection">
<h2 class="homeText" style="line-height:2">
       Looking to plant a garden, but don't know where to start? Let us help you plan your perfect plot! <br><br>Enter your zip code and choose the plants you’d like for your garden:
       <br>
      </h2>
 <div class="zipDiv">     
<input alt="Enter a 5 digit zipcode here" type="text" maxlength="5" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\/g, '$1');" class="zipcode" placeholder="Enter Your Zipcode"> 
</div>
<img alt="Click here to submit the form with your Zipcode and selected plants." src="./img/gardenBtn.png" input type="submit" class="submitButton"> 
<div class="homeBottomTextDiv">
<h2 class="homeBtmTxt" style="line-height:2">We'll tell you if you should begin the seeds indoors or plant outside based on your area.</h2> 
</div>
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
