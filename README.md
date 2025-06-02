# design_patterns
A design pattern code for java developers


In our Claims Processing System, we used various design patterns based on real requirements.
For example, we used the Singleton pattern to manage token validation logic and ensure only one instance exists throughout.
For object creation like notification types, we used Factory.
Builder helped us construct complex ClaimResponse objects with readability.
Strategy was used for choosing claim validation logic dynamically based on provider type.
Observer helped us notify multiple services like Email or SMS after status change.
To validate claims in steps (policy → amount → duplicate), we applied Chain of Responsibility.
We wrapped old SOAP-based APIs using Adapter to make them compatible with REST, and we exposed complex subsystems via Facade to simplify use in service layer.
