cd sirius-components/frontend
npm ci --legacy-peer-deps
npm run build
yalc publish
cd ..
cd ..
cd sirius-web
cd frontend
rm -rf .yalc
cd node_modules
rm -rf @eclipse-sirius
yalc add @eclipse-sirius/sirius-components@0.5.0
npm i
npm run build
cd ..
mkdir -p backend/sirius-web-frontend/src/main/resources/static
cp -R frontend/build/* backend/sirius-web-frontend/src/main/resources/static
cd backend 
mvn install -DskipTests=true
