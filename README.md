# Jetpack Navigation Example  

This is a sample Android project demonstrating the use of **Jetpack Navigation** with **BottomNavigationView** and **DrawerLayout**. Additionally, it includes **Safe Args** to pass data between fragments.  

## 📌 Features  
✔️ Jetpack Navigation Component  
✔️ Bottom Navigation with multiple fragments  
✔️ Drawer Navigation for additional navigation options  
✔️ Safe Args for type-safe argument passing between fragments  

## 🛠️ Tech Stack  
- **Kotlin**  
- **Jetpack Navigation Component**  
- **BottomNavigationView & DrawerLayout**  
- **Safe Args for navigation**  

## 🚀 Screenshots  
| Bottom Navigation | Drawer Navigation | Safe Args Example |
|------------------|------------------|------------------|
| ![Bottom Navigation]([https://via.placeholder.com/200](https://private-user-images.githubusercontent.com/103856332/417805773-8658ea99-abcf-41ad-87b2-fe875881e117.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NDA2OTU3ODksIm5iZiI6MTc0MDY5NTQ4OSwicGF0aCI6Ii8xMDM4NTYzMzIvNDE3ODA1NzczLTg2NThlYTk5LWFiY2YtNDFhZC04N2IyLWZlODc1ODgxZTExNy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwMjI3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDIyN1QyMjMxMjlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xMDFkNTVhNjk2MzJkZmJmYWQ0MWRlM2VlYjA0YzcxOTBhMTk5OTZiMTA1YWFlNjZjOTc1MzIzNzU5ZjI1NzAxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.6dmOtV0sp44uUlD4lVRFhzGnpIpIBGqC6rVd1-iyDdI)) | ![Drawer Menu]([https://via.placeholder.com/200](https://private-user-images.githubusercontent.com/103856332/417805750-fd9842f4-3ff2-41a8-83d9-babbd59b8b2b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NDA2OTU2MDEsIm5iZiI6MTc0MDY5NTMwMSwicGF0aCI6Ii8xMDM4NTYzMzIvNDE3ODA1NzUwLWZkOTg0MmY0LTNmZjItNDFhOC04M2Q5LWJhYmJkNTliOGIyYi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwMjI3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDIyN1QyMjI4MjFaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01N2I0OTQzMjkwMGIyMWQ5YTkwNTFhYmJhNWMyMWFmNjA5M2MxY2JjZjY4ZWU0ZmExNjQ2MzUyOGM5MjExMjNjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.HUoom1DXBCtQ3n9v4c9nuGKH4z0duhAebPf1FuFVs9U)) | ![Safe Args]([https://via.placeholder.com/200](https://private-user-images.githubusercontent.com/103856332/417805819-6c16c049-2bfc-478a-87f7-e4f4fb0b797c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NDA2OTU3ODksIm5iZiI6MTc0MDY5NTQ4OSwicGF0aCI6Ii8xMDM4NTYzMzIvNDE3ODA1ODE5LTZjMTZjMDQ5LTJiZmMtNDc4YS04N2Y3LWU0ZjRmYjBiNzk3Yy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwMjI3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDIyN1QyMjMxMjlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yZGFmZTg4ZWFmMmQxM2YwZjhmODllNGE4OWJmOWVhOTRmN2FmMDgwZjliNTViOWYwNjVhNzgxMWFhN2MwMDQyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.fkQpHkagDEpKMc-CJi-71zM1iq9o0atBeG9H1k7dNR8)) |

## 🔧 Setup & Installation  
1. Clone the repository  
```bash

