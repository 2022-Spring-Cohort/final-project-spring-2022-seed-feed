export default function header(){
return `
<header>
<div class ="banner">
<img alt="Header banner image of Vegetables" class="bannerImage" src="img/veg-top-2.png">
</div>
<div class="logoDiv">
<img alt="Styalized Logo for Seed & Feed" class="mainLogo" src="/img/logo.png">
</div>



</header>

<nav>
<ul class="navList">
   <li title="Home Button. Click to return to the Home View" class ="homeBtn">HOME</li>
   <li title="Recipes Button. Click here to see all the recipes." class="allRecipesButton">RECIPES</li>
   <li title="About Us Button. Click here to meet the Developers of this site." class="aboutUsButton">ABOUT</li>
   <li title="Garden Resourcse Button. Click here to see some handy infromation." class="gardenResources">GARDEN RESOURCES</li>
    </ul>  
     </nav>


<div id="aboutUsModal" class="aboutusmodal">
        <div class="aboutusmodal-content">
            <span class="closeModal">&times;</span>
            <div class="aboutuscontent">
            <img class="modalImg" src="/img/logo.png">
             
                        <article class="photos">
                            <section class="person">
                                <a class="headshots" href="https://benjamin-gibbs-2.github.io/" target="_blank"><img class="profile" alt="Ben's Headshot" src="./img/people/Ben_Gibbs.jpg"/></a>
                                    <div class="individual">
                                        <p class="personName">Ben Gibbs</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/benjamin-gibbs-2" target="_blank"><img class="logo" alt="GitHub Logo" src="./img/branded_logos/GitHub-Mark-120px-plus.png"></a>
                                        <a href="https://www.linkedin.com/in/benjamin-gibbs2/" target="_blank"><img class="logo" alt="LinkedIn Logo" src="./img/branded_logos/LI-In-Bug.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/averycs/" target="_blank"><img class="profile" alt="Avery's Headshot " src="./img/people/Avery_Smith.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Avery Smith</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/AveryCS" target="_blank"><img class="logo" alt="GitHub Logo" src="./img/branded_logos/GitHub-Mark-120px-plus.png"></a>
                                        <a href="https://www.linkedin.com/in/averycs/" target="_blank"><img class="logo" alt="LinkedIn Logo" src="./img/branded_logos/LI-In-Bug.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://mccurdyr.github.io" target="_blank"><img class="profile" alt="Ryan's Headshot" src="./img/people/Ryan_McCurdy.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Ryan McCurdy</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer & Compassion Enthusiast</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/mccurdyr" target="_blank"><img class="logo" alt="GitHub Logo" src="./img/branded_logos/GitHub-Mark-120px-plus.png"></a>
                                        <a href="https://www.linkedin.com/in/mccurdyr/" target="_blank"><img class="logo" alt="LinkedIn Logo" src="./img/branded_logos/LI-In-Bug.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/jenniferannadams/" target="_blank"><img class="profile" alt="Jen's Headshot" src="./img/people/Jen_Adams.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Jennifer Adams</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/jenniferaadams" target="_blank"><img class="logo" alt="GitHub Logo" src="./img/branded_logos/GitHub-Mark-120px-plus.png"></a>
                                        <a href="https://www.linkedin.com/in/jenniferannadams/" target="_blank"><img class="logo" alt="LinkedIn Logo" src="./img/branded_logos/LI-In-Bug.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/dylan-creech1/" target="_blank"><img class="profile" alt="Dylan's Headshot" src="./img/people/Dylan_Creech.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Dylan Creech</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/Shoko1321" target="_blank"><img class="logo" alt="GitHub Logo" src="./img/branded_logos/GitHub-Mark-120px-plus.png"></a>
                                        <a href="https://www.linkedin.com/in/dylan-creech1/" target="_blank"><img class="logo" alt="LinkedIn Logo" src="./img/branded_logos/LI-In-Bug.png"></a>
                                    </div>
                          
                        </section>
                        <br>
                              <h2>Contact the team at SeedandFeed2022@gmail.com</h2>
                </article>
            </div>
        </div>
     </div>
`;



}

