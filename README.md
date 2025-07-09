CUSTOM AUTHENTICATION WITH SECRET KEY

- Created the all parts needed for a custom authentication with a secret key
- Started with the Authentication Filter from SecurityFilterChain
- Implemented a Custom Authentication Manager and next a Custom Authentication Provider
- Saved the Authentication object that is authenticated in the SecurityContext and then pass to the next filter from the
  chain
- The custom filter was created in place of UsernamePasswordAuthenticationFilter