# Online-Retail-Store-Project
Building a CI/CD Pipeline for an Online Retail Store Company
In this project, we develop a CI/CD pipeline to automate the software development, testing, packaging, and deployment of an App for a retail company, reducing the time to market the app and ensuring good quality service is experienced by end users.

Some of the technologies and tools used include:

Maven
GitHub
Jenkins
Docker
Ansible
Kubernetes
Grafana
Prometheus
Background
Here are some simple and basic explanations of what each of the tools above are

CI/CD CI and CD stand for continuous integration and continuous delivery/continuous deployment. In straightforward terms, CI is a modern software development practice in which incremental code changes are made frequently and reliably. Continuous delivery automates the deployment of a release to an environment for staging or testing. Continuous deployment automatically deploys every release through your pipeline (including testing) and to production.

Maven is a project management build tool used primarily in Java development. It is used to manage dependencies and software lifecycle. It is also designed to work with plugins that allow users to add other tasks to the standard compile, test, package, install, and deploy tasks

Jenkins is a popular CI orchestration tool. It provides numerous plugins for integration with multiple test automation tools and frameworks into the test pipeline. Regarding Test Automation, Jenkins provides plugins that help run test suites, gather dashboard results, and provide details on failures.

GitHub is a code hosting platform for version control and collaboration. It lets you and others work together on projects from anywhere.

Ansible is used in managing configurations, running playbooks for continuous deployments, basically streamlining the deployment, and orchestrating different environments.

Docker is a tool that allows developers, sys-admins etc. to easily deploy their applications in a sandbox (called containers) to run on the host operating system i.e. Linux. The key benefit of Docker is that it allows users to package an application with all of its dependencies into a standardized unit for software development. Unlike virtual machines, containers do not have high overhead and hence enable more efficient usage of the underlying system and resources.

Kubernetes is an open-source container orchestration tool at heart. It helps automate managing and deploying containerized applications, making it easier for developers to build, deploy and manage their applications.

Grafana allows users to see their data via charts and graphs that are unified into one dashboard (or multiple dashboards!) for easier interpretation and understanding.

Prometheus is an open-source technology designed to provide monitoring and alerting functionality for cloud-native environments, including Kubernetes. It can collect and store metrics as time-series data, recording information with a timestamp.

Pipeline: A set of jobs executed in a sequence. on

Prerequisites
An AWS account– EC2 Instances ( 4GB RAM, 2 VCPU’s)
A Source code
Maven
A GitHub account
Jenkins
Docker
Ansible
Kubernetes
Grafana
Prometheus

SWORT ONLINE STORE is fast growing online retail store. The store recently witnessed a large increase of order placed online across the globe but is following the conventional pattern of development and deployment. As a result, it has landed at a great loss and is facing the following challenges.

Low available
Low scalable
Low performance
Hard to built and maintain
Developing and deploying are time-consuming SWORT STORE will acquire the data from all these storage systems and plans to use it for analytics and prediction of the firm’s growth and sales prospects. In the first phase, SWORT STORE has to create the servlets to add a product and display product details. Add servlet dependencies required to compile the servlets. Create an HTML page that will be used to add a product. Our Team used Git to keep all the source code. SWORT STORE has decided to use the DevOps model. we integrated our sorce code from github account with Jenkins and provide continuous build generation for continuous delivery as well as integrate with Ansible and Kubernetes for deployment.  we Use Docker Hub to pull and push images between Ansible and Kubernetes.

Goal of the Project
To implement CI/CD such that SWORT ONLINE STORE is able to be —

highly available
highly scalable
highly performant
easily built and maintained
developed and deployed quickly
Problem Statements/Tasks

Problem Statements/Tasks
we developed a CI/CD pipeline to automate the software development, testing, packaging, and deployment, reducing the time to market the app and ensuring good quality service is experienced by end users. In this project, we
pushed the code to our GitHub repository
create a continuous integration pipeline using Jenkins to compile, test, and package the code present in GitHub.
Write Dockerfile to push the war file to the Tomcat server
Integrate Docker with Ansible and write the playbook
Deploy artifacts to the Kubernetes cluster
Monitor resources using Grafana.

