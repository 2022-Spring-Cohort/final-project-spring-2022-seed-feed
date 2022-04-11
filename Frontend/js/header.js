export default function header(){
return `
<header>
<div class ="banner">
<img alt="Header banner image of Vegetables" class="bannerImage" src="img/veg-top-2.png">
</div>
<h1 class="mainTitle">Seed & Feed</h1> 
<h2 class="welcome">Welcome to Seed & Feed! A Modern Garden Planner and Recipe Finder</h2>

</header>

<nav>
<ul class="navList">
   <li title="Home Button. Click to return to the Home View" class ="homeBtn">Home</li>
   <li title="Recipes Button. Click here to see all the recipes." class="allRecipesButton">Recipes</li>
   <li title="About Us Button. Click here to meet the Developers of this site." class="aboutUsButton">About</li>
   <li title="Garden Resourcse Button. Click here to see some handy infromation." class="gardenResources">Gardening Resources</li>
    </ul>  
     </nav>


<div id="aboutUsModal" class="aboutusmodal">
        <div class="aboutusmodal-content">
            <span class="closeModal">&times;</span>
            <div class="aboutuscontent">
                <h1 class="aboutUs">Seed & Feed</h1>
                    <h2 class="linkInfo">Meet the Developers:</h2>
                        <article class="photos">
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/benjamin-gibbs2/" target="_blank"><img class="profile" alt="Ben's Headshot" src="./img/people/Ben.jpg"/></a>
                                    <div class="individual">
                                        <p class="personName">Ben Gibbs</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/benjamin-gibbs-2"><img class="logo" alt="GitHub Logo" src="./img/GitHubLogo.png"></a>
                                        <a href="https://www.linkedin.com/in/benjamin-gibbs2/"><img class="logo" alt="LinkedIn Logo" src="./img/LinkedInLogo.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/averycs/" target="_blank"><img class="profile" alt="Avery's Headshot " src="./img/people/Avery.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Avery Smith</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/AveryCS"><img class="logo" alt="GitHub Logo" src="./img/GitHubLogo.png"></a>
                                        <a href="https://www.linkedin.com/in/averycs/"><img class="logo" alt="LinkedIn Logo" src="./img/LinkedInLogo.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://mccurdyr.github.io" target="_blank"><img class="profile" alt="Ryan's Headshot" src="./img/people/Ryan.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Ryan McCurdy</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer & Compassion Enthusiast</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/mccurdyr"><img class="logo" alt="GitHub Logo" src="./img/GitHubLogo.png"></a>
                                        <a href="https://www.linkedin.com/in/mccurdyr/"><img class="logo" alt="LinkedIn Logo" src="./img/LinkedInLogo.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/jenniferannadams/" target="_blank"><img class="profile" alt="Jen's Headshot" src="./img/people/Jen.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Jennifer Adams</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/jenniferaadams"><img class="logo" alt="GitHub Logo" src="./img/GitHubLogo.png"></a>
                                        <a href="https://www.linkedin.com/in/jenniferannadams/"><img class="logo" alt="LinkedIn Logo" src="./img/LinkedInLogo.png"></a>
                                    </div>
                            </section>
                            <section class="person">
                                <a class="headshots" href="https://www.linkedin.com/in/dylan-creech1/" target="_blank"><img class="profile" alt="Dylan's Headshot" src="./img/people/Dylan.jpg" /></a>
                                    <div class="individual">
                                        <p class="personName">Dylan Creech</p>
                                        <p class="aboutText">Full-Stack Software and Web Developer</p>
                                    </div>
                                    <div class="logos">
                                        <a href="https://github.com/Shoko1321"><img class="logo" alt="GitHub Logo" src="./img/GitHubLogo.png"></a>
                                        <a href="https://www.linkedin.com/in/dylan-creech1/"><img class="logo" alt="LinkedIn Logo" src="./img/LinkedInLogo.png"></a>
                                    </div>
                                
                        </section>
                </article>
            </div>
        </div>
     </div>
`;



}

