export default function header(){
return`
<header>
<div class ="banner">
<img class="bannerImage" src="img/veg-top-2.png">
</div>
<h1 class="mainTitle">Seed & Feed</h1> 
<h2 class="subtitle">A Modern Garden Planner and Recipe Finder</h2>
</header>

<nav>
<ul class="navList">
   <li class ="homeBtn">Home</li>
   <li class="allRecipesButton">Recipes</li>
   <li class="aboutUsButton">About</li>
   <li class="gardenResources">Gardening Resources</li>

</ul>    
</nav>

<div id="aboutUsModal" class="aboutusmodal">
        <div class="aboutusmodal-content">
            <span class="closeModal">&times;</span>
            <div class="aboutuscontent">
                <h1 class="aboutUs">Seed & Feed</h1>
                <h2 class="linkInfo">Meet the Developers:</h2>
                <article class="photos">
                    <section class="BenName">
                        <a class="headshots" href="https://www.linkedin.com/in/hari-adhikari-77935116b/" target="_blank"> 
                        <img class="profile" alt="Smith Headshot" src="./img/beets_photo.jpg"/></a>
                        <p class="personName">Ben Gibbs</p>
                    </section>
                    <section class="avery names">
                        <a class="headshots" href="https://www.linkedin.com/in/averycs/" target="_blank"> 
                        <img class="profile"
                        alt="Averys Headshot " src="./img/carrots_photo.jpg" /></a>
                        <p class="personName">Avery Smith</p>
                    </section>
                    <section class="RyanName">
                        <a class="headshots" href="https://www.linkedin.com/in/mikethecoder/" target="_blank">
                         <img class="profile" alt="Mikes Headshot" src="./img/carrots_photo.jpg" />
                         </a>
                        <p class="personName">Ryan McCurdy</p>
                    </section>
                    <section class="JenniferName">
                    <a class="headshots" href="https://www.linkedin.com/in/mikethecoder/" target="_blank">
                     <img class="profile" alt="Mikes Headshot" src="./img/beets_photo.jpg" />
                     </a>
                    <p class="personName">Jennifer Adams</p>
                </section>
                <section class="DylanName">
                <a class="headshots" href="https://www.linkedin.com/in/mikethecoder/" target="_blank">
                 <img class="profile" alt="Mikes Headshot" src="./img/cabbage_photo.jpg" />
                 </a>
                <p class="personName">Dylan Creech</p>
            </section>
                </article>
            </div>
        </div>
     </div>
`

}

