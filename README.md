<div align="center">

# 🏺 loam
### *shaped by hand*

A native Android pottery marketplace app — browse and shop handmade ceramic pieces, built end-to-end in Kotlin.

![Kotlin](https://img.shields.io/badge/Kotlin-C24E2A?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-1E5B4F?style=for-the-badge&logo=androidstudio&logoColor=white)
![XML](https://img.shields.io/badge/XML%20Layouts-C9962C?style=for-the-badge&logo=xml&logoColor=white)
![Status](https://img.shields.io/badge/Status-In%20Development-8C2F4B?style=for-the-badge)

</div>

<br>

Loam is a pottery-only crafts marketplace app — vases, mugs, planters, dinnerware, wall hangings, trays, and more — wrapped in a warm, tactile interface that mirrors the handmade products it sells.

<br>

## <sub>01</sub> 🌅 Onboarding

<table>
<tr>
<td width="33%"><img src="screenshots/main.png" width="220"/><p align="center"><sub><b>SPLASH</b></sub></p></td>
<td width="33%"><img src="screenshots/loam%20sign_in.png" width="220"/><p align="center"><sub><b>SIGN IN</b></sub></p></td>
<td width="33%"><img src="screenshots/loam%20signup.png" width="220"/><p align="center"><sub><b>SIGN UP</b></sub></p></td>
</tr>
</table>

A frosted-panel auth flow on a warm sunrise background, carrying the wordmark and line-art pot & vase logo through every screen.

<br>

## <sub>02</sub> 🏠 Home

<table>
<tr>
<td width="50%"><img src="screenshots/Home1.jpeg" width="220"/><p align="center"><sub><b>HOME — TOP</b></sub></p></td>
<td width="50%"><img src="screenshots/Home2.jpeg" width="220"/><p align="center"><sub><b>HOME — SCROLLED</b></sub></p></td>
</tr>
</table>

Hero banner → horizontally scrolling **Featured Pieces** → textured clay banner → more product cards.

<br>

## <sub>03</sub> 🛍️ Shop

<table>
<tr>
<td width="50%"><img src="screenshots/Shop1.jpeg" width="220"/><p align="center"><sub><b>CATEGORIES</b></sub></p></td>
<td width="50%"><img src="screenshots/Shop2.jpeg" width="220"/><p align="center"><sub><b>MORE CATEGORIES</b></sub></p></td>
</tr>
</table>

Full catalog organized by category: **Vases/Decor Vessels · Mugs & Cups · Planters · Dinnerware · Wall Hangings · Trays & Platters.**

<br>

## <sub>04</sub> 🛒 Cart &nbsp;·&nbsp; 👤 Profile

<table>
<tr>
<td width="50%"><img src="screenshots/cart.png" width="220"/><p align="center"><sub><b>CART</b></sub></p></td>
<td width="50%"><img src="screenshots/profile.png" width="220"/><p align="center"><sub><b>PROFILE</b></sub></p></td>
</tr>
</table>

Quantity steppers, subtotal/delivery/total, checkout — plus a profile hub for orders, saved items, addresses, payment, and settings.

<br>

## 🛠️ Tech Stack

| Layer | Choice |
|---|---|
| Language | Kotlin |
| UI | XML layouts (LinearLayout / RelativeLayout / ConstraintLayout) |
| IDE | Android Studio |
| Navigation | Custom nav screen — FrameLayout + tab row, manual view switching (no Fragment API) |

## 📁 Project Structure

```
app/
├── SplashActivity / onboarding
├── SignUpActivity
├── SignInActivity
├── NavigationActivity2        # hosts bottom nav + manual screen switching
│   ├── HomeView
│   ├── ShopView
│   ├── CartView
│   └── ProfileView
└── res/
    ├── layout/
    ├── drawable/
    └── values/
```

## 🎨 Palette

<div align="center">

| ![#C24E2A](https://placehold.co/80x40/C24E2A/C24E2A.png) | ![#1E5B4F](https://placehold.co/80x40/1E5B4F/1E5B4F.png) | ![#C9962C](https://placehold.co/80x40/C9962C/C9962C.png) | ![#8C2F4B](https://placehold.co/80x40/8C2F4B/8C2F4B.png) | ![#221A15](https://placehold.co/80x40/221A15/221A15.png) |
|:---:|:---:|:---:|:---:|:---:|
| Rust `#C24E2A` | Emerald `#1E5B4F` | Gold `#C9962C` | Berry `#8C2F4B` | Ink `#221A15` |

</div>

## 🗺️ Roadmap

- [ ] Wire up `RecyclerView` for reusable product data across Home and Shop
- [ ] Connect Cart quantity/remove actions to real state
- [ ] Hook up Profile sub-pages (Orders, Saved Items, Shipping, Payment, Settings)
- [ ] Backend/data layer integration

<br>

<div align="center">
<i>shaped by hand, pixel by pixel 🏺</i>
</div>
