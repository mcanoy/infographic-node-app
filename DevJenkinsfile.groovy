developmentPipeline{
    buildCommands = ['npm install -only=dev'] // Add this when we figure out , 'npm run-script validate']
    unitTestCommand = 'npm test'
    buildTool = 'node-0.10'
    ocHost = 'mcanoy-playground.demo.innovation.redhat.com'
    projectName = 'mcanoy-playground'
    appName = 'infographic-node-app'
}
