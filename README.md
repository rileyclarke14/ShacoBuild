# ShacoBuild
Takes two league of legends team compositions and outputs whether to build Assassin Shaco or AP Box Control Shaco.
Currently a WIP. Last updated 11/9/2022.
The software will ask you to input your team's champions and the enemy team's champions and depending on the predetermined traits for that character (their damage type,
whether they are ranged/melee, if they are dive or poke, etc.)
It will store these team comps in an array and look at each champions attributes and output a result. 

Current Notes: The main ShacoBuilder java file does not work correctly, so FromScratch is a dumbed down version which simply asks about whether or not the enemy team is dive or whether you have 2 ap solo laners (mid and top)

To Do:
Decide when to build tanko
Actually make the code work lol
