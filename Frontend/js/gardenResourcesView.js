export default function gardenResourcesView(){
    return `
    <h1>Gardening Resources</h1>

    <h2>Our Favorite Places to Buy Seeds</h2>

    <section class="resourcesSection">

                <div class="resourceTitle">
            <h2>How to Start Seeds Indoors</h2>
            </div>
    
        <div class ="seedDiv">
            


            <div class="resourceContent">
            <h2>Baker Creek Seeds</h2>
            <a href="https://www.rareseeds.com/" target="_blank" rel="noopener noreferrer"><img src="./img/baker_creek.jpg"></a>
             </div>

             <div class="resourceContent">
            <p>Johnny Seeds</p>
            <a href="https://www.johnnyseeds.com/" target="_blank" rel="noopener noreferrer"><img src="./img/johnnys.jpg"></a>
            </div>

            <div class="resourceContent">
            <p>Botanical Interests</p>
            <a href="https://www.botanicalinterests.com/" target="_blank" rel="noopener noreferrer"><img src="./img/botanical_interests.jpg"></a>
            </div>
         </div>
    
        
        <br>
        
            
        
            <div class="seedStart">
        
                <a href="https://joegardener.com/podcast/037-starting-seeds-indoors-pt-1/" target="_blank" rel="noopener noreferrer"><img src="./img/joe_gardner_seedstarting.jpg"></a>
            <p>Joe Gardener- Starting Seeds Indoors</p>
            
            <a href="https://www.almanac.com/content/starting-seeds-indoors" target="_blank" rel="noopener noreferrer"><img src="./img/almanac_seed_starting.jpg"></a>
            <p>Farmers Almanac- Starting Seeds</p>
        
                <a href="https://www.burpee.com/blog/indoor-seed-starting_article10002.html" target="_blank" rel="noopener noreferrer"><img src="./img/burpee_seedstart.jpg"></a>
            <p>Indoor Seed Starting</p>
        
        </div>
        
        <br>
        
        <h2>Canning Your Harvest</h2>
        
        <div class="canning">
        
            <a href="https://www.almanac.com/canning-for-beginners" target="_blank" rel="noopener noreferrer"><img src="./img/almanac_canning.jpg"></a>
            <p>Canning for Beginners</p>
        
            <a href="https://www.freshpreserving.com/" target="_blank" rel="noopener noreferrer"><img src="./img/ball_canning.jpg"></a>
            <p>Ball Canning Website</p>
        
            <a href="https://www.youtube.com/watch?v=NPAUnhEPqoc" target="_blank" rel="noopener noreferrer"><img src="./img/canning_video.jpg"></a>
            <p>Canning 101</p>
        
        </div>
        
        <br>
        
        <h2>All About Soil</h2>
        
        <div class="soilDiv">
        
            <a href="https://charlesdowding.co.uk/start-here/" target="_blank" rel="noopener noreferrer"><img src="./img/no_dig.jpg"></a>
            <p>No Dig Gardening</p>
        
            <a href="https://www.ars.usda.gov/oc/tips-for-healthy-soil-in-your-backyard-garden/" target="_blank" rel="noopener noreferrer"><img src="./img/usda.jpg"></a>
            <p>Healthy Soil Tips</p>

            <a href="https://www.gardeners.com/how-to/building-healthy-soil/5060.html" target="_blank" rel="noopener noreferrer"><img src="./img/healthy_soil.jpg"></a>
            <p>Building Healthy Soil</p>
        
        </div>
        
        <br>
    </section>
    <button class ="backToHomeBtn">Back to home</button>
    `;
}