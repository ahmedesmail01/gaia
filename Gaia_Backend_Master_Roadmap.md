# Gaia E-commerce Backend — Master Learning & Delivery Roadmap

**Student:** ____________________  
**Started:** ____________________  
**Target completion:** ____________________  
**Current phase:** Phase 0  
**Current task:** 0.1  
**Overall status:** Not started

> This is the permanent roadmap for learning Java and Spring Boot while building and deploying Gaia. Check a box only after completing its verification. When returning to ChatGPT, say: **“Continue Gaia from Phase X, Task X.X.”**

## How to use this roadmap

1. Work on one numbered task at a time.
2. Learn only the concepts required for that task.
3. Write the Gaia code yourself, with guidance.
4. Run the verification commands and tests.
5. Check the task only when its “done when” condition is true.
6. Commit each completed task to Git with a clear message.
7. Record blockers and decisions in the progress log at the end.

## Definition of Done for Gaia

Gaia is complete when:

- Customers can register, verify their email, sign in and manage addresses.
- Admins can manage categories, brands, products, variants, images and inventory.
- Customers can browse, search and filter products.
- Customers can manage a persistent cart and apply valid coupons.
- The backend calculates prices, discounts, shipping and totals securely.
- Checkout reserves stock and creates an order without overselling.
- Paymob payments are created and confirmed through verified, idempotent webhooks.
- Customers can see order history; admins can manage order status.
- Automated tests cover important business and security flows.
- The application runs through Docker and is deployed with a CI/CD pipeline.
- Health checks, logs, metrics, backups and rollback procedures are available.

---

# Stage A — Java and Development Foundations

## Phase 0 — Prepare the workstation

**Goal:** Create a reliable Java development environment.

### 0.1 Install and verify tools

- [ ] Install JDK 21.
- [ ] Install IntelliJ IDEA Community or Ultimate.
- [ ] Install Git.
- [ ] Install Docker Desktop.
- [ ] Install Postman or Bruno.
- [ ] Install PostgreSQL client tools such as DBeaver or pgAdmin.
- [ ] Create GitHub account/repository access if needed.

Verify:

```bash
java -version
javac -version
git --version
docker --version
docker compose version
```

**Done when:** Every command works and Java reports version 21.

### 0.2 Learn terminal and Git basics

- [ ] Understand files, folders and absolute/relative paths.
- [ ] Practice `cd`, `ls`, `mkdir`, `pwd`.
- [ ] Learn `git init`, `status`, `add`, `commit`, `log`, `branch`.
- [ ] Understand repository, commit, branch and `.gitignore`.

**Practice:** Create a small folder, add a README, commit it and view its history.

**Done when:** You can create a repository and commit without copying commands blindly.

### Phase 0 checkpoint

- [ ] Workstation is ready.
- [ ] Git basics are understood.
- [ ] Docker can start a test container.

---

## Phase 1 — Essential Java

**Goal:** Learn enough Java to understand Spring code instead of memorizing it.

### 1.1 Java syntax

- [ ] Variables and primitive types.
- [ ] `String`, arrays and operators.
- [ ] Conditions: `if`, `else`, `switch`.
- [ ] Loops: `for`, enhanced `for`, `while`.
- [ ] Methods, parameters and return values.
- [ ] Packages and imports.

**Gaia exercise:** Build a console price calculator with quantity, unit price and discount.

**Done when:** It calculates totals correctly for at least five test cases.

### 1.2 Object-oriented programming

- [ ] Classes and objects.
- [ ] Fields, methods and constructors.
- [ ] Access modifiers.
- [ ] Encapsulation.
- [ ] Interfaces.
- [ ] Inheritance versus composition.
- [ ] `static`, `final` and immutability.
- [ ] Records.
- [ ] Enums.

**Gaia exercise:** Create `Product`, `Money`, `CartItem`, `OrderStatus` and a `DiscountPolicy` interface.

**Done when:** A cart can calculate its total using objects, without placing all logic in `main`.

### 1.3 Collections, exceptions and generics

- [ ] `List`, `Set` and `Map`.
- [ ] Generics.
- [ ] Checked and unchecked exceptions.
- [ ] Create a custom exception.
- [ ] `Optional` and correct use cases.
- [ ] `BigDecimal` for money.
- [ ] `LocalDate`, `Instant` and time zones.

**Gaia exercise:** Prevent duplicate SKUs and throw `ProductNotFoundException` when appropriate.

**Done when:** You can explain why Gaia must not use `double` for prices.

### 1.4 Modern Java essentials

- [ ] Lambda expressions.
- [ ] Stream operations: `filter`, `map`, `sorted`, `collect`.
- [ ] Method references.
- [ ] Try-with-resources.
- [ ] Basic annotations.

**Gaia exercise:** Filter available products and map them into lightweight product responses.

### 1.5 Unit testing Java

- [ ] Understand test arrangement: Arrange, Act, Assert.
- [ ] Write JUnit tests.
- [ ] Test normal cases, edge cases and failures.
- [ ] Understand what mocking is, without overusing it.

**Done when:** The console cart has tests for empty cart, multiple items, discounts and invalid quantity.

### Phase 1 checkpoint

- [ ] Java syntax exercises are complete.
- [ ] OOP Gaia exercise is complete.
- [ ] Collections and exceptions are understood.
- [ ] At least 10 JUnit tests pass.
- [ ] Code is committed: `learn: complete Java foundations`.

---

# Stage B — Spring Boot Foundations

## Phase 2 — Create the Gaia project

**Goal:** Start the real backend and understand its moving parts.

### 2.1 Generate Gaia

Use:

- Maven
- Java
- Spring Boot 4.1.x stable, never SNAPSHOT
- Group: `com.gaia`
- Artifact: `gaia-backend`
- Name: `Gaia`
- Package: `com.gaia.ecommerce`
- Packaging: Jar
- Java: 21
- YAML configuration

Initial dependencies:

- Spring Web
- Validation
- Spring Data JPA
- PostgreSQL Driver
- Flyway Migration
- Spring Security
- OAuth2 Resource Server
- OAuth2 Client
- Spring Data Redis
- Spring Boot Actuator
- Docker Compose Support
- Testcontainers
- PostgreSQL Testcontainers
- Spring Security Test

Tasks:

- [ ] Generate and open the project.
- [ ] Understand `pom.xml`.
- [ ] Understand `GaiaApplication`.
- [ ] Understand Maven dependencies and plugins.
- [ ] Run the application.
- [ ] Create a Git repository and first commit.

**Done when:** Gaia starts successfully and `/actuator/health` returns `UP`.

### 2.2 Understand dependency injection

- [ ] Learn bean, component and application context.
- [ ] Learn `@Component`, `@Service`, `@Repository`, `@Configuration`.
- [ ] Use constructor injection.
- [ ] Understand why field injection should be avoided.

**Exercise:** Build a temporary greeting service and controller, then test it.

### 2.3 Learn REST basics

- [ ] HTTP methods.
- [ ] Status codes.
- [ ] Headers and JSON.
- [ ] Path variables and query parameters.
- [ ] Request and response DTOs.
- [ ] `@RestController`, mappings and `ResponseEntity`.

**Exercise:** Create an in-memory `/api/v1/products` API.

**Done when:** Create, list and retrieve product endpoints work through Postman.

### 2.4 Validation and error handling

- [ ] Add Bean Validation annotations to request DTOs.
- [ ] Add global error handling using `@RestControllerAdvice`.
- [ ] Return Problem Details errors.
- [ ] Add stable application error codes.
- [ ] Never expose stack traces to API clients.

**Done when:** Invalid requests return useful `400` errors and missing products return `404`.

### Phase 2 checkpoint

- [ ] Gaia project runs.
- [ ] REST and dependency injection basics are understood.
- [ ] Validation works.
- [ ] Global errors are consistent.
- [ ] Code is committed: `feat: establish Gaia Spring Boot foundation`.

---

## Phase 3 — PostgreSQL, JPA and migrations

**Goal:** Persist Gaia data safely.

### 3.1 Start infrastructure locally

- [ ] Create `compose.yaml`.
- [ ] Add PostgreSQL.
- [ ] Add Redis.
- [ ] Use environment variables for credentials.
- [ ] Add persistent Docker volumes.
- [ ] Connect through DBeaver or pgAdmin.

**Done when:** PostgreSQL and Redis are healthy and accessible locally.

### 3.2 Learn SQL foundations

- [ ] Tables, rows and columns.
- [ ] Primary and foreign keys.
- [ ] Unique constraints.
- [ ] `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
- [ ] Joins.
- [ ] Indexes.
- [ ] Transactions.
- [ ] Constraints and normalization.

**Exercise:** Design and query categories, brands and products manually.

### 3.3 Learn JPA carefully

- [ ] Entity lifecycle.
- [ ] `@Entity`, `@Id`, generated IDs.
- [ ] Column mappings and constraints.
- [ ] Relationships.
- [ ] Lazy versus eager loading.
- [ ] Repositories.
- [ ] Pagination and sorting.
- [ ] Transactions.
- [ ] N+1 query problem.
- [ ] Optimistic locking with `@Version`.

Rules:

- [ ] Do not expose entities from controllers.
- [ ] Do not use Lombok `@Data` on entities.
- [ ] Avoid bidirectional relationships unless required.
- [ ] Keep transactions in application services.

### 3.4 Add Flyway

- [ ] Set Hibernate DDL mode to `validate`.
- [ ] Create `V1__initial_schema.sql`.
- [ ] Learn forward-only migration practices.
- [ ] Test migrations on an empty database.
- [ ] Never edit a migration already applied to shared environments.

**Done when:** A fresh database can be created entirely from migrations.

### 3.5 MapStruct and DTOs

- [ ] Add a Spring Boot 4-compatible MapStruct version.
- [ ] Create request and response models.
- [ ] Create mappers.
- [ ] Keep API models separate from entities.

### Phase 3 checkpoint

- [ ] PostgreSQL and Redis run through Compose.
- [ ] Flyway creates the schema.
- [ ] JPA CRUD works.
- [ ] Pagination works.
- [ ] Repository integration tests use PostgreSQL Testcontainers.
- [ ] Code is committed: `feat: add Gaia persistence foundation`.

---

# Stage C — Gaia Domain Modules

## Phase 4 — Architecture and module boundaries

**Goal:** Prevent Gaia from becoming a tangled project.

Modules:

```text
auth
customer
catalog
inventory
cart
promotion
checkout
order
payment
shipping
notification
review
admin
shared
```

Tasks:

- [ ] Organize packages by business feature.
- [ ] Learn controller, application, domain and infrastructure responsibilities.
- [ ] Add Spring Modulith.
- [ ] Define public module APIs.
- [ ] Prevent modules from accessing another module’s internals.
- [ ] Add a Modulith verification test.
- [ ] Create an architecture decision record explaining the modular monolith choice.

**Done when:** Module verification passes and dependencies have clear directions.

---

## Phase 5 — Catalog

**Goal:** Let admins manage and customers browse products.

### 5.1 Categories and brands

- [ ] Category entity and migration.
- [ ] Optional parent category.
- [ ] Brand entity and migration.
- [ ] Admin CRUD endpoints.
- [ ] Slug generation and unique constraints.
- [ ] Validation and integration tests.

### 5.2 Products and variants

- [ ] Product.
- [ ] Product variant.
- [ ] SKU uniqueness.
- [ ] Product attributes/options.
- [ ] Product images and primary image.
- [ ] Active/draft/archived status.
- [ ] Money and currency fields.

### 5.3 Customer catalog APIs

- [ ] Product listing.
- [ ] Product detail by slug.
- [ ] Pagination.
- [ ] Category and brand filtering.
- [ ] Price range.
- [ ] Allowlisted sorting.
- [ ] Basic PostgreSQL search.

### 5.4 Media storage

- [ ] Add an object-storage interface.
- [ ] Use MinIO locally or a local development adapter.
- [ ] Validate file size and content type.
- [ ] Store object keys, not binary files, in PostgreSQL.
- [ ] Add cloud adapter later.

**Phase 5 done when:** An admin can create a complete product and a customer can find it through the public API.

---

## Phase 6 — Authentication and customers

**Goal:** Secure Gaia correctly.

### 6.1 Security fundamentals

- [ ] Authentication versus authorization.
- [ ] Password hashing.
- [ ] JWT structure and limitations.
- [ ] CORS, CSRF and XSS basics.
- [ ] Roles and permissions.

### 6.2 Registration and login

- [ ] User and role schema.
- [ ] Email/password registration.
- [ ] Unique normalized email.
- [ ] Password hashing.
- [ ] Email verification token.
- [ ] Login endpoint.
- [ ] Short-lived access token.
- [ ] Rotating refresh tokens stored hashed.
- [ ] Logout and token revocation.
- [ ] Password reset.

### 6.3 Authorization

- [ ] Roles: `CUSTOMER`, `ADMIN`, `CATALOG_MANAGER`, `ORDER_MANAGER`, `SUPPORT`.
- [ ] Protect admin routes.
- [ ] Add method-level authorization.
- [ ] Ensure customers access only their own resources.
- [ ] Security tests for forbidden access.

### 6.4 Google login

- [ ] Configure OAuth2/OIDC client.
- [ ] Link Google identity to an existing verified email safely.
- [ ] Prevent duplicate accounts.

### 6.5 Customer profile

- [ ] Profile endpoint.
- [ ] Customer addresses.
- [ ] Default shipping address.
- [ ] Wishlist.

**Phase 6 done when:** Registration, verification, login, refresh, logout and authorization tests pass.

---

## Phase 7 — Inventory

**Goal:** Track stock without overselling.

- [ ] Inventory per product variant.
- [ ] Available, reserved and sold quantities.
- [ ] Inventory movement ledger.
- [ ] Admin stock adjustment endpoint.
- [ ] Stock reservation with expiration.
- [ ] Release expired reservations.
- [ ] Optimistic or pessimistic concurrency strategy.
- [ ] Tests with simultaneous purchase attempts.
- [ ] Low-stock reporting.

**Done when:** Two concurrent customers cannot purchase the same final unit.

---

## Phase 8 — Cart

**Goal:** Maintain a valid customer shopping cart.

- [ ] Persistent authenticated-user cart.
- [ ] Add item.
- [ ] Change quantity.
- [ ] Remove item.
- [ ] Clear cart.
- [ ] Merge guest cart after login, if required.
- [ ] Check product and variant availability.
- [ ] Return price-change warnings.
- [ ] Never accept a trusted price from the frontend.
- [ ] Calculate cart subtotal server-side.

**Done when:** Cart operations work and changing a frontend-supplied price cannot change the calculated total.

---

## Phase 9 — Promotions and pricing

**Goal:** Centralize all money calculations.

- [ ] Define pricing service.
- [ ] Product sale pricing.
- [ ] Fixed and percentage coupons.
- [ ] Minimum order value.
- [ ] Start/end dates.
- [ ] Per-user and total usage limits.
- [ ] Applicable categories/products.
- [ ] Shipping calculation.
- [ ] Tax policy, if required.
- [ ] Rounding rules.
- [ ] Unit tests for every pricing rule.

**Done when:** Cart and checkout call one authoritative pricing service and all edge cases are tested.

---

## Phase 10 — Orders and checkout

**Goal:** Convert a cart into an immutable commercial record.

- [ ] Order aggregate.
- [ ] Order items with product, SKU and price snapshots.
- [ ] Shipping/billing address snapshots.
- [ ] Separate order and payment statuses.
- [ ] Order status history.
- [ ] Checkout idempotency key.
- [ ] Recalculate and validate totals.
- [ ] Reserve inventory.
- [ ] Create pending order transactionally.
- [ ] Clear the cart only at the correct point.
- [ ] Customer order history and detail endpoints.
- [ ] Admin order management.
- [ ] Cancellation rules.

**Done when:** Repeating an identical checkout request cannot create duplicate orders.

---

## Phase 11 — Paymob payments

**Goal:** Process payment without trusting browser redirects.

- [ ] Create `PaymentGateway` interface.
- [ ] Implement `PaymobPaymentGateway`.
- [ ] Store payment attempts.
- [ ] Create payment session/intention.
- [ ] Send an idempotency or merchant order reference.
- [ ] Store Paymob references.
- [ ] Create webhook endpoint.
- [ ] Verify Paymob HMAC/signature.
- [ ] Save webhook events.
- [ ] Prevent duplicate event processing.
- [ ] Match amount, currency and order.
- [ ] Mark payment and order status transactionally.
- [ ] Handle success, failure, expiration and cancellation.
- [ ] Add refunds.
- [ ] Add reconciliation job for missed/inconsistent events.
- [ ] Test using sandbox credentials.

**Critical rule:** A frontend success redirect never proves that an order was paid.

**Done when:** Duplicate webhooks are harmless and only a verified provider event can confirm payment.

---

## Phase 12 — Notifications, shipping and reviews

### Notifications

- [ ] Verification email.
- [ ] Password reset email.
- [ ] Order confirmation.
- [ ] Payment confirmation/failure.
- [ ] Shipping status updates.
- [ ] Retry failed notifications.
- [ ] Keep notification failure from rolling back a paid order.

### Shipping

- [ ] Shipping methods and fees.
- [ ] Shipment record.
- [ ] Tracking number.
- [ ] Shipment status.
- [ ] External provider adapter when needed.

### Reviews

- [ ] Verified-purchase rule.
- [ ] Rating range validation.
- [ ] One review per eligible order item/product.
- [ ] Moderation status.

**Done when:** Secondary integrations operate through adapters and cannot corrupt order/payment state.

---

# Stage D — Quality, Security and Production

## Phase 13 — Testing and quality

**Goal:** Make changes without fear.

- [ ] Unit tests for domain rules.
- [ ] Controller/API tests.
- [ ] Repository tests with PostgreSQL Testcontainers.
- [ ] Security authorization tests.
- [ ] Module integration tests.
- [ ] Paymob contract/webhook tests.
- [ ] End-to-end checkout test.
- [ ] Flyway-from-empty test.
- [ ] Architecture rules.
- [ ] Static analysis.
- [ ] Dependency vulnerability scanning.
- [ ] Meaningful coverage report; do not chase coverage percentage alone.

Minimum critical flows:

- [ ] Register and login.
- [ ] Admin creates product and stock.
- [ ] Customer adds item and checks out.
- [ ] Concurrent final-item purchase.
- [ ] Successful verified payment.
- [ ] Invalid and duplicate webhook.
- [ ] Cancel/refund.
- [ ] Unauthorized admin access.

**Done when:** The full test suite runs automatically and consistently.

---

## Phase 14 — API documentation and frontend readiness

- [ ] Add Springdoc OpenAPI compatible with the selected Spring Boot version.
- [ ] Document authentication.
- [ ] Document endpoints and error codes.
- [ ] Provide example requests/responses.
- [ ] Version API under `/api/v1`.
- [ ] Configure strict environment-specific CORS.
- [ ] Publish a Postman/Bruno collection.
- [ ] Define frontend integration checklist.

**Done when:** A frontend developer can integrate without reading backend source code.

---

## Phase 15 — Docker and local production simulation

- [ ] Create multi-stage Dockerfile or Spring Boot buildpack image.
- [ ] Run as a non-root user.
- [ ] Add `.dockerignore`.
- [ ] Configure JVM/container memory.
- [ ] Add health/readiness probes.
- [ ] Enable graceful shutdown.
- [ ] Use environment variables and secret references.
- [ ] Do not place secrets in Git or the image.
- [ ] Run Gaia, PostgreSQL and Redis through Compose.
- [ ] Test database persistence across restarts.
- [ ] Test clean startup from an empty environment.

**Done when:** Another machine can start the complete local stack using documented commands.

---

## Phase 16 — CI/CD and deployment

Recommended Azure path:

- Azure Container Registry
- Azure Container Apps
- Azure Database for PostgreSQL
- Azure Managed Redis
- Azure Blob Storage
- Azure Key Vault
- Application Insights/OpenTelemetry

### CI

- [ ] Checkout and use pinned Java version.
- [ ] Cache Maven safely.
- [ ] Compile.
- [ ] Run unit and integration tests.
- [ ] Verify migrations.
- [ ] Run static/security scans.
- [ ] Build Docker image.
- [ ] Scan image.
- [ ] Tag with Git commit SHA.
- [ ] Push immutable image.

### CD

- [ ] Create development environment.
- [ ] Create staging environment.
- [ ] Configure production secrets.
- [ ] Deploy staging.
- [ ] Run smoke tests.
- [ ] Add production approval.
- [ ] Deploy production.
- [ ] Verify health/readiness.
- [ ] Document rollback to the previous image.
- [ ] Use safe, backward-compatible database deployments.

**Done when:** A commit can pass CI, deploy to staging, be approved for production and be rolled back safely.

---

## Phase 17 — Observability, backups and launch

- [ ] Structured JSON logs.
- [ ] Correlation and trace IDs.
- [ ] Actuator health with limited public exposure.
- [ ] Prometheus/Micrometer metrics.
- [ ] OpenTelemetry tracing.
- [ ] Error-rate and latency dashboards.
- [ ] Payment failure and webhook alerts.
- [ ] Database backup schedule.
- [ ] Restore test—not only backup creation.
- [ ] Object-storage retention policy.
- [ ] Log retention and sensitive-data redaction.
- [ ] Rate limiting.
- [ ] Load testing.
- [ ] Production security checklist.
- [ ] Incident and rollback runbook.
- [ ] Domain, HTTPS and WAF/CDN.

Business metrics:

```text
orders_created_total
payments_succeeded_total
payments_failed_total
checkout_duration
inventory_reservation_failures_total
payment_webhook_processing_duration
```

**Done when:** Gaia can be monitored, restored and operated safely after launch.

---

# Suggested learning schedule

This is a sequence, not a deadline. Move only after each checkpoint.

| Block | Focus | Expected outcome |
|---|---|---|
| 1 | Phases 0–1 | Java foundations and tested console cart |
| 2 | Phase 2 | First Spring REST API |
| 3 | Phase 3 | PostgreSQL, JPA, Flyway and Testcontainers |
| 4 | Phases 4–5 | Modular architecture and product catalog |
| 5 | Phase 6 | Authentication and customers |
| 6 | Phases 7–9 | Inventory, cart and pricing |
| 7 | Phases 10–11 | Checkout, orders and Paymob |
| 8 | Phases 12–14 | Integrations, testing and documentation |
| 9 | Phases 15–17 | Docker, deployment and operations |

## Study rhythm for each session

Use a 90–120 minute session:

1. **15–25 minutes:** Learn one concept.
2. **45–70 minutes:** Apply it directly to Gaia.
3. **15 minutes:** Test and debug.
4. **5 minutes:** Check the roadmap and write a progress note.

Do not watch many hours of tutorials before coding. Learn a small concept, implement it and explain it back in your own words.

---

# Senior-development rules for Gaia

- [ ] Prefer a modular monolith before microservices.
- [ ] Keep business rules out of controllers.
- [ ] Use constructor dependency injection.
- [ ] Never return JPA entities directly.
- [ ] Use `BigDecimal` for money.
- [ ] Use database constraints as well as Java validation.
- [ ] Use migrations for every schema change.
- [ ] Never trust prices, totals, roles or ownership sent by the frontend.
- [ ] Keep credentials outside the repository.
- [ ] Make checkout and webhooks idempotent.
- [ ] Do not confirm payment from a redirect.
- [ ] Test concurrency around inventory.
- [ ] Log identifiers, not passwords, tokens or full payment data.
- [ ] Add new infrastructure only when Gaia has a demonstrated need.
- [ ] Commit small, working changes.

---

# Progress dashboard

Update this table after each checkpoint.

| Phase | Name | Status | Completed date |
|---:|---|---|---|
| 0 | Workstation | Not started | |
| 1 | Java foundations | Not started | |
| 2 | Spring Boot foundation | Not started | |
| 3 | PostgreSQL and JPA | Not started | |
| 4 | Architecture | Not started | |
| 5 | Catalog | Not started | |
| 6 | Authentication and customers | Not started | |
| 7 | Inventory | Not started | |
| 8 | Cart | Not started | |
| 9 | Promotions and pricing | Not started | |
| 10 | Orders and checkout | Not started | |
| 11 | Paymob | Not started | |
| 12 | Notifications, shipping, reviews | Not started | |
| 13 | Testing and quality | Not started | |
| 14 | API documentation | Not started | |
| 15 | Docker | Not started | |
| 16 | CI/CD and deployment | Not started | |
| 17 | Operations and launch | Not started | |

Allowed status values: `Not started`, `In progress`, `Blocked`, `Completed`.

## Progress log

| Date | Phase/task | What was completed | Blocker or next action |
|---|---|---|---|
| | | | |
| | | | |
| | | | |

## Architecture decisions

| Date | Decision | Reason |
|---|---|---|
| | Start as a modular monolith | Lower operational complexity while preserving module boundaries |
| | PostgreSQL as the primary database | Strong transactional support for orders, stock and payments |
| | Java 21 | Stable LTS baseline with broad platform support |

## Current resume point

**Phase:** 0  
**Task:** 0.1 — Install and verify tools  
**Next action:** Install/verify JDK 21, Git, Docker, IDE and API/database clients.  
**Last updated:** 2026-07-26

