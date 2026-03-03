Spring Framework: Bean Management Basics 
This project is part of my journey through "Spring Starts Here" by Laurentiu Spilca. It demonstrates the fundamental transition 
from manual object creation in Java to Inversion of Control (IoC) using the Spring Context.

I am Configuring the Spring Context using the @Configuration annotation.
I am Adding custom objects to the Spring "warehouse" using the @Bean annotation.
I am Retrieving managed objects (Beans) from the AnnotationConfigApplicationContext.

The Project Structure
The application is built using three core components:
1. The Model (Parrot.java): A simple Java Object representing the data.
2. The Configuration (ProjectConfig.java): The "Blueprint" that instructs Spring on which beans to create.
3. The Runner (Main.java): The entry point that initializes the Spring Context and retrieves the managed beans.

Implementation
In this project, I moved away from manual instantiation (new Parrot()). 
I now use:
@Configuration acts as the warehouse floor plan.

@Bean provides the specific instructions for creating a "Parrot" instance.

Spring Context acts as the warehouse manager, holding the instance and providing it upon request.

Code Snippet: Defining a Bean
How to Run
Ensure you have Maven installed and Java 11+ configured.

Clone the repository.

Import the project into IntelliJ IDEA.

Run the Main.java class.

Expected Output: The console should print the name of the parrot ("Oke") retrieved directly from the Spring Context.

Key Takeaway
The most important lesson here was Inversion of Control. I no longer manage the lifecycle of the Parrot object; 
I delegating that responsibility to the Spring Framework.

💡 Pro-Tip for your GitHub
If you have a screenshot of your console output showing the parrot's name, you can actually drag and drop that image into your README on GitHub to make it look even more impressive!
