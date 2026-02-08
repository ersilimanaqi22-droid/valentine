<!DOCTYPE html>
<html lang="de">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Valentinstag 💖</title>
  <style>
    body {
      margin: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(135deg, #ff758c, #ff7eb3);
      color: white;
      display: flex;
      align-items: center;
      justify-content: center;
      min-height: 100vh;
      text-align: center;
    }
    .card {
      background: rgba(255, 255, 255, 0.15);
      backdrop-filter: blur(10px);
      padding: 40px 30px;
      border-radius: 20px;
      max-width: 420px;
      box-shadow: 0 20px 40px rgba(0,0,0,0.25);
    }
    h1 {
      font-size: 2.2rem;
      margin-bottom: 10px;
    }
    h2 {
      font-weight: normal;
      margin-bottom: 25px;
    }
    p {
      font-size: 1.1rem;
      line-height: 1.6;
      margin-bottom: 30px;
    }
    .buttons {
      display: flex;
      gap: 15px;
      justify-content: center;
    }
    button {
      border: none;
      padding: 12px 22px;
      font-size: 1rem;
      border-radius: 30px;
      cursor: pointer;
      transition: transform 0.2s ease, box-shadow 0.2s ease;
    }
    button:hover {
      transform: translateY(-2px);
      box-shadow: 0 10px 20px rgba(0,0,0,0.25);
    }
    .yes {
      background: #ffffff;
      color: #ff4d6d;
      font-weight: bold;
    }
    .no {
      background: transparent;
      color: white;
      border: 2px solid white;
    }
    .heart {
      font-size: 3rem;
      margin-bottom: 15px;
      animation: pulse 1.5s infinite;
    }
    @keyframes pulse {
      0% { transform: scale(1); }
      50% { transform: scale(1.15); }
      100% { transform: scale(1); }
    }
    audio { display: none; }
    .photo {
      width: 140px;
      height: 140px;
      object-fit: cover;
      border-radius: 50%;
      margin: 15px auto 20px;
      display: block;
      border: 3px solid rgba(255,255,255,0.6);
      box-shadow: 0 10px 25px rgba(0,0,0,0.3);
    }
</style>
</head>
<body>
<audio autoplay loop>
  <source src="song.mp3" type="audio/mpeg">
</audio>
  <div class="card">
    <div class="heart">❤️</div>
    <img src="photo.jpg" alt="Us" class="photo" />
    <h1>Mein Herz 💖</h1>
    <h2>Willst du mein Valentinstag-Date sein, meine Liebe?</h2>
    <p>
    Seitdem du in meinem Leben bist, fühlt sich jeder Tag besonderer an.
    Am Valentinstag möchte ich nur eines: diesen Moment mit dir teilen.
  </p>
    <div class="buttons">
      <button class="yes" onclick="alert('Yeeees! 💖 Ich freue mich riesig!')">Ja 💕</button>
      <button class="no" id="noBtn">Nein 😅</button>
    </div>
  </div>
  <script>
    const noBtn = document.getElementById('noBtn');
    noBtn.addEventListener('mouseover', moveButton);
    noBtn.addEventListener('touchstart', moveButton);

    function moveButton() {
      const x = Math.random() * (window.innerWidth - 100);
      const y = Math.random() * (window.innerHeight - 50);
      noBtn.style.position = 'fixed';
      noBtn.style.left = `${x}px`;
      noBtn.style.top = `${y}px`;
    }
  </script>
</body>
</html>
