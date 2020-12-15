<!DOCTYPE html>
<html>
<!--REALISE PAR LRY41 GEOFFREY-->
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width"/>
<link rel="stylesheet" href="fichierSuppTuto.css">
<style type="text/css">

.Head{
	font-size: 60px;
  margin-top:25px;
  color:red;
  text-align :center;
  font-family:"DroidSans",Arial,sans-serif;
}
.CaptureClient{
 margin-left: 450px;




               }
.Etape{


      background-color: red;
      color: black;
      padding: 10px 10px;
      
      text-decoration: none;
      display: inline-block;
      font-size: 35px;
      cursor: pointer;
      width :1400px;
      height:40px;
      margin-bottom: 20px;


      }
      .EtapeBis{


      background-color: red;
      color: black;
      padding: 10px 10px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 35px;
      cursor: pointer;
      width :1400px;
      height:40px;
      margin-bottom: 20px;


      }
      .presentation{
        text-align: center 
        margin-left:40px;
      }
      .redirectionHome{
          
         color: white ;
         text-decoration: none;
         display: inline-block;
         font-size: 20px;
         
         cursor: pointer;
         
         
         
      }
      .redirectionTutoAdmin{
        font-size: 20px;
         color: black ;
         text-decoration: none;
         display: inline-block;
         margin-top: 0px;
         margin-left:1300px;
         cursor: pointer;
      }

      .centreEtape{
        margin-top: -40px;
        margin-left:650px;
      }
</style>
</head>

<body>
<div class ="Head">
Tutoriel Client
</div>

<div class ="Etape">
      
        <a href ="Aide.php"class="redirectionHome"> Home </a>
      
  <div class="centreEtape">
      Etape 1
  </div>
      
       <a href ="TutoClient.php" class ="redirectionTutoAdmin"> Tuto Client</a>
</div>


<div class ="CaptureClient">
<img src="CaptureRailway/HomeAdmin.png" alt="HomeAdmin"width ="500px" />
</div>
<div class ="Presentation">
<p> Voici la page d'acceuil où vous pouvez choisir entre aller vers la page permettant d'ajouter des trains ou des lignes  et meme permettant d'ajouter des admin.</p>  
</div>


<div class ="EtapeBis">
  Etape 2
  </div>
  <div class ="CaptureClient">
<img src="CaptureRailway/addAdmin.png" alt="addAdmin"width ="500px" />
</div>
<div class ="Presentation">
<p>
Vous allez ici rentrer les données personnelles utiles pour créer un nouveau Admin .(attention il y a quelques reglementation pour vos données).</p>
</div>



<div class ="EtapeBis">
  Etape 3
  </div>
<div class ="CaptureClient">
<img src="CaptureRailway/addTrain.png" alt="addTrain"width ="500px" />
</div>
<div class ="Presentation">
<p>
Vous allez ici rentrer les données utiles pour créer un nouveau train avec son cout annuel et son nombre de place ainsi que son Nom.</p>
</div>

<div class ="EtapeBis">
  Etape 4
  </div>
<div class ="CaptureClient">
<img src="CaptureRailway/addLigne.png" alt="addLigne"width ="500px" />
</div>
<div class ="Presentation">
<p>
Vous allez ici rentrer les données utiles pour créer une nouvelle ligne avec son nom , date darrivée , date de depart , gare depart , gare arrivée ,distance,place max,id train ,prix billet .</p>
</div>




</body>
</html>
