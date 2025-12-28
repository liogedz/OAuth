# 🔐 Java SpringBoot OAuth2 Login

A minimum configuration Spring Boot application with OAuth2 authentication supporting GitHub and Google login providers.

---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Maven or Gradle
- GitHub and/or Google account for OAuth credentials

---

## ⚙️ Configuration

### Step 1: Environment Setup

Rename `.env.example` to `.env` in the root directory:

```bash
cp .env.example .env
```

The `.env` file should contain:

```properties
GITHUB_CLIENT_ID=
GITHUB_CLIENT_SECRET=
GOOGLE_CLIENT_ID=
GOOGLE_CLIENT_SECRET=
```

### Step 2: Application Properties

Ensure your `application.properties` includes:

```properties
spring.config.import=optional:file:.env[.properties]
```

---

## 🔑 OAuth Provider Setup

### <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="20" height="20" /> GitHub OAuth Configuration

1. Navigate to **Settings** → **Developer Settings** → **OAuth Apps**
2. Click **New OAuth App**
3. Fill in the application details:
    - **Application Name:** `Spring Security Login Oauth2` (or your preferred name)
    - **Homepage URL:** `http://localhost:8080`
    - **Authorization callback URL:** `http://localhost:8080/login/oauth2/code/github`
4. Click **Register application**
5. Copy the **Client ID** and generate a **Client Secret**
6. Paste both values into your `.env` file

### <img src="https://www.google.com/favicon.ico" width="20" height="20" /> Google OAuth Configuration

1. Visit the [Google OAuth2 documentation](https://developers.google.com/identity/protocols/oauth2)
2. Click on **Google API Console** link in the text
3. Navigate to **OAuth consent screen** → **Credentials** → **Create Credentials** → **OAuth client ID**
4. Configure your OAuth client:
    - **Application type:** Web application
    - **Name:** `Spring Security Login Oauth2` (or your preferred name)
    - **Authorized redirect URIs:** `http://localhost:8080/login/oauth2/code/google`
5. Click **Create**
6. Copy the **Client ID** and **Client Secret**
7. Paste both values into your `.env` file

---

## 🎯 Running the Application

After completing the configuration:

```bash
mvn spring-boot:run
```

- Navigate to `http://localhost:8080` and you should see `"Hey! Without security"`.
- Navigate to `http://localhost:8080/secure` and you should see login options for GitHub and Google.

---

## 📝 Notes

- Keep your `.env` file secure and never commit it to version control
- Add `.env` to your `.gitignore` file
- For production deployments, use secure secret management solutions

---

## 🤝 Contributing

Feel free to submit issues and enhancement requests!

---

## 📄 License

[Your License Here]