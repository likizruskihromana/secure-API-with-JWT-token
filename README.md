# 🔐 Spring Boot JWT Security

A Spring Boot 3.0 application demonstrating secure API authentication using JWT tokens and Spring Security.

## Features

- JWT-based authentication (stateless)
- User registration and login
- Secure logout with token invalidation
- Protected API endpoints
- Spring Security integration

## Tech Stack

- Spring Boot 3.0
- Spring Security
- JWT (JJWT)
- Spring Data JPA
- PostgreSQL

## API Endpoints

### Authentication
- `POST /api/v1/auth/register` - Register user
- `POST /api/v1/auth/authenticate` - Login user
- `POST /api/v1/auth/logout` - Logout user

### Protected
- `GET /api/v1/demo-controller` - Demo endpoint (requires JWT)

## How it Works

1. User registers/logs in → receives JWT token
2. Token sent in Authorization header for protected requests
3. Server validates token on each request
4. Logout invalidates the token

## Requirements

- Java 17+
- Maven 3.6+
- PostgreSQL database

