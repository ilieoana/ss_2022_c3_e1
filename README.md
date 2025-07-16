# Spring Security Fundamentals - Custom authentication

This project is based on **Lesson 3 - Custom authentication** from
the [Spring Security Fundamentals](https://www.youtube.com/playlist?list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP) tutorial
series by **Laur Spilca** on
YouTube.

## 📚 Tutorial Reference

- **Author:** Laur Spilca
- **Series:** Spring Security Fundamentals
- **Lesson:** 3 - Custom authentication
- **Link:** [Watch on YouTube](https://www.youtube.com/watch?v=asAUMpEcdXw&list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP&index=3)

## 🛠️ What I Did

This project was implemented as part of my learning journey with Spring Security. I followed the tutorial closely and:

- Recreated the project from scratch in my local environment.
- Created the all parts needed for a custom authentication with a secret key
- Started with the CustomAuthenticationFilter from SecurityFilterChain
- Implemented a CustomAuthenticationManager and next a CustomAuthenticationProvider
- Saved the Authentication object that is authenticated in the SecurityContext and then passED to the next filter from the chain
- The custom filter was created in place of UsernamePasswordAuthenticationFilter