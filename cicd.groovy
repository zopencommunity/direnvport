node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/direnvport.git'), string(name: 'PORT_DESCRIPTION', value: 'Load and unload env. variables and envs, depending on the current directory' )]
  }
}
